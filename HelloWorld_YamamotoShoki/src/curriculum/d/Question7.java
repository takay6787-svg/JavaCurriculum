package curriculum.d;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

	// ファイル名
	private static final String DAEMON_STATUS_FILE = "daemon_status.txt";
	private static final String BATTLE_LOG_FILE = "battle_log.txt";

	// Playerのステータス範囲
	private static final int PLAYER_HP_MIN = 50;
	private static final int PLAYER_HP_MAX = 100;

	private static final int PLAYER_AT_MIN = 10;
	private static final int PLAYER_AT_MAX = 20;

	private static final int PLAYER_SP_MIN = 1;
	private static final int PLAYER_SP_MAX = 10;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// バトルログをためる
		StringBuilder log = new StringBuilder();

		System.out.print("Playerの名前を入力してください: ");
		String playerName = sc.nextLine();

		// Playerを作る
		Character player = createPlayer(playerName, rand);

		// Daemonをファイルから読み込む
		Character daemon = loadDaemon(DAEMON_STATUS_FILE);
		

		// Daemonが読み込めなかった場合は終了する
		if (daemon == null) {
			System.out.println("Daemonの読み込みに失敗しました。");
			sc.close();
			return;
		}

		log.append("=== バトル開始 ===\n");
		log.append(player.getStatus()).append("\n");
		log.append(daemon.getStatus()).append("\n\n");

		// 先攻と後攻を決める
		Character[] turnOrder = decideTurnOrder(player, daemon, rand);
		Character first = turnOrder[0];
		Character second = turnOrder[1];

		log.append("先攻: ").append(first.getName()).append("\n\n");

		// どちらかのHPが0になるまで繰り返す
		while (player.isAlive() && daemon.isAlive()) {

			// 先攻が攻撃する
			attack(first, second, log);

			// 後攻が倒れたら終了する
			if (!second.isAlive()) {
				break;
			}

			// 後攻が攻撃する
			attack(second, first, log);
		}

		log.append("=== バトル終了 ===\n");

		// 勝者を記録する
		if (player.isAlive()) {
			log.append(player.getName()).append("の勝ち！\n");
		} else {
			log.append(daemon.getName()).append("の勝ち！\n");
		}

		// バトルログを書き込む
		writeBattleLog(BATTLE_LOG_FILE, log.toString());

		// コンソールに表示する
		System.out.println(log.toString());
		System.out.println("バトル結果を " + BATTLE_LOG_FILE + " に出力しました。");

		// Scannerを閉じる
		sc.close();
	}

	// Playerを作る
	public static Character createPlayer(String playerName, Random rand) {

		int hp = getRandomStatus(rand, PLAYER_HP_MIN, PLAYER_HP_MAX);
		int at = getRandomStatus(rand, PLAYER_AT_MIN, PLAYER_AT_MAX);
		int sp = getRandomStatus(rand, PLAYER_SP_MIN, PLAYER_SP_MAX);

		return new Character(playerName, hp, at, sp);
	}

	// ランダムなステータスを返す
	public static int getRandomStatus(Random rand, int min, int max) {
		return rand.nextInt(max - min + 1) + min;
	}

	// Daemonのステータスを読み込む
	public static Character loadDaemon(String fileName) {

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String name = br.readLine();
			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());

			return new Character(name, hp, at, sp);

		} catch (IOException e) {
			System.out.println("ファイルの読み込みでエラーが発生しました。");
		} catch (NumberFormatException e) {
			System.out.println("ステータスの数値が正しくありません。");
		}

		return null;
	}

	// 先攻と後攻を決める
	public static Character[] decideTurnOrder(Character player, Character daemon, Random rand) {

		Character first;
		Character second;

		if (player.getSp() > daemon.getSp()) {
			first = player;
			second = daemon;
		} else if (player.getSp() < daemon.getSp()) {
			first = daemon;
			second = player;
		} else {
			if (rand.nextBoolean()) {
				first = player;
				second = daemon;
			} else {
				first = daemon;
				second = player;
			}
		}

		return new Character[] { first, second };
	}

	// 攻撃する
	public static void attack(Character attacker, Character defender, StringBuilder log) {

		int damage = attacker.getAt();
		int hpAfterAttack = defender.getHp() - damage;

		// HPが0より小さくならないようにする
		if (hpAfterAttack < 0) {
			hpAfterAttack = 0;
		}

		defender.setHp(hpAfterAttack);

		log.append(attacker.getName())
				.append("の攻撃！ ")
				.append(defender.getName())
				.append("に")
				.append(damage)
				.append("のダメージ！\n");

		if (defender.getHp() == 0) {
			log.append(defender.getName()).append("は倒れた！\n\n");
		} else {
			log.append(defender.getName())
					.append("の残りHP: ")
					.append(defender.getHp())
					.append("\n\n");
		}
	}

	// バトルログを書き込む
	public static void writeBattleLog(String fileName, String text) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

			bw.write(text);

		} catch (IOException e) {
			System.out.println("ファイルの書き込みでエラーが発生しました。");
		}
	}
}