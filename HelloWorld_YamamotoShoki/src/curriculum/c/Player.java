package curriculum.c;

import java.util.Scanner;

public class Player {

	// 手を入力する
	public int inputHand(Scanner sc) {
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
		return sc.nextInt();
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