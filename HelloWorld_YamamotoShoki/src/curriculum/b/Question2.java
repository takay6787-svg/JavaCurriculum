package curriculum.b;

import java.util.Scanner;

// Question2クラス
// Java基礎問題2（条件分岐：if / switch）の練習
public class Question2 {

    // プログラムの開始地点（ここから実行される）
    public static void main(String[] args) {

        // Scanner：キーボード入力（コンソール入力）を受け取るための道具
        Scanner sc = new Scanner(System.in);

        // ===== Q1 =====
        // int型の変数scoreに 75 を代入し、60以上なら「合格です！」と表示
        int score1 = 75;
        if (score1 >= 60) {
            System.out.println("合格です！");
        }

        // ===== Q2 =====
        // 年齢が20以上30以下かを判定して表示
        int age1 = 25;
        if (age1 >= 20 && age1 <= 30) {
            System.out.println("適正年齢です");
        } else {
            System.out.println("対象外です");
        }

        // ===== Q3 =====
        // 年齢によって表示を分岐（成人 / ティーン / 子供）
        int age2 = 18;
        if (age2 >= 20) {
            System.out.println("成人です");
        } else if (age2 >= 13 && age2 <= 19) {
            System.out.println("ティーンエイジャーです");
        } else {
            System.out.println("子供です");
        }

        // ===== Q4 =====
        // 3つの数値の中で一番大きい数を表示
        int x = 30;
        int y = 15;
        int z = 50;

        // 「xが最大」「yが最大」「それ以外（zが最大）」で分ける
        if (x >= y && x >= z) {
            System.out.println(x);
        } else if (y >= x && y >= z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        // ===== Q5 =====
        // コンソール入力した数が「正」「0」「負」どれか判定
        System.out.print("Q5: 数字を入力してください: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0です");
        } else {
            System.out.println("負の数です");
        }

        // ===== Q6 =====
        // コンソール入力した数が「偶数」「奇数」どちらか判定
        System.out.print("Q6: 数字を入力してください: ");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }

        // ===== Q7 =====
        // コンソール入力した点数で成績判定（優・良・可・不可）
        System.out.print("Q7: 点数(0〜100)を入力してください: ");
        int score2 = sc.nextInt();

        if (score2 >= 90) {
            System.out.println("優");
        } else if (score2 >= 70) {
            System.out.println("良");
        } else if (score2 >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        // 注意：nextInt() を使うと「改行」が残ることがある
        // ここで1回 nextLine() を読んで改行を消しておく
        sc.nextLine();

        // ===== Q8 =====
        // 文字列を入力させて、空なら「入力が無効です」と表示
        System.out.print("Q8: 文字を入力してください（空でもOK）: ");
        String input = sc.nextLine();

        // nullチェック + 空文字チェック
        if (input == null || input.isEmpty()) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力内容: " + input);
        }

        // ===== Q9 =====
        // 数値(1〜7)を入力させて曜日を表示（switch）
        System.out.print("Q9: 曜日番号(1〜7)を入力してください: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            case 7:
                System.out.println("日曜日");
                break;
            default:
                System.out.println("無効な入力です");
        }

        // ===== Q10 =====
        // 月(1〜12)を入力させて季節を表示（switch）
        System.out.print("Q10: 月(1〜12)を入力してください: ");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            default:
                System.out.println("無効な月です");
        }

        // Scannerを閉じる（後片付け）
        sc.close();
    }
}

