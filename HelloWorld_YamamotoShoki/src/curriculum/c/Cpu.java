package curriculum.c;

import java.util.Random;

public class Cpu {

	// ランダムで手を決める
	public int getRandomHand() {
		Random rand = new Random();
		return rand.nextInt(3);
	}

	// 手の名前を返す
	public String getHandName(int hand) {
		switch (hand) {
		case 0:
			return "グー";
		case 1:
			return "チョキ";
		case 2:
			return "パー";
		default:
			return "不正な値";
		}
	}
}