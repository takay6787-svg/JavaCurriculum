package curriculum.c;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Playerクラスを作る
		Player player = new Player();

		// Cpuクラスを作る
		Cpu cpu = new Cpu();

		// 勝ったかどうかを管理する
		boolean isWin = false;

		// 勝つまで繰り返す
		while (!isWin) {

			// プレイヤーの手を入力する
			int playerHand = player.inputHand(sc);

			// 入力値を確認する
			if (playerHand < 0 || playerHand > 2) {
				System.out.println("0, 1, 2 のどれかを入力してください。");
				continue;
			}

			// CPUの手をランダムで決める
			int cpuHand = cpu.getRandomHand();

			System.out.println("あなたの手: " + player.getHandName(playerHand));
			System.out.println("CPUの手: " + cpu.getHandName(cpuHand));

			// 勝敗を判定する
			if (playerHand == cpuHand) {
				System.out.println("あいこです。もう一度！");
			} else if ((playerHand == 0 && cpuHand == 1)
					|| (playerHand == 1 && cpuHand == 2)
					|| (playerHand == 2 && cpuHand == 0)) {
				System.out.println("あなたの勝ち！");
				isWin = true;
			} else {
				System.out.println("あなたの負けです。もう一度！");
			}

			System.out.println();
		}

		// Scannerを閉じる
		sc.close();
	}
}