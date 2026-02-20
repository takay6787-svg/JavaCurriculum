package curriculum.b;

import java.util.Random;
import java.util.Scanner;

/**
 * Question3クラス
 * Java基礎問題3（繰り返し処理）の練習
 */
public class Question3 {

    public static void main(String[] args) {

        // Scanner：キーボード入力を受け取るための道具
        Scanner sc = new Scanner(System.in);

        // Random：ランダム値を生成するための道具
        Random rand = new Random();

        // ===== Q1 =====
        // for文を使って 1から10までの数字を1つずつ表示
        System.out.println("=== Q1 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // ===== Q2 =====
        // for文を使って 2から20までの偶数を表示
        System.out.println("=== Q2 ===");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // ===== Q3 =====
        // for文を使って 10から1までカウントダウン
        System.out.println("=== Q3 ===");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // ===== Q4 =====
        // for文を使って 1から100までの合計を表示
        System.out.println("=== Q4 ===");
        int sumFor = 0;
        for (int i = 1; i <= 100; i++) {
            sumFor += i;
        }
        System.out.println(sumFor);

        // ===== Q5 =====
        // for文を使って三角形を出力
        System.out.println("=== Q5 ===");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ===== Q6 =====
        // while文を使って 1から10まで表示
        System.out.println("=== Q6 ===");
        int w1 = 1;
        while (w1 <= 10) {
            System.out.println(w1);
            w1++;
        }

        // ===== Q7 =====
        // while文を使って 2から20までの偶数を表示
        System.out.println("=== Q7 ===");
        int w2 = 2;
        while (w2 <= 20) {
            System.out.println(w2);
            w2 += 2;
        }

        // ===== Q8 =====
        // while文を使って 10から1までカウントダウン
        System.out.println("=== Q8 ===");
        int w3 = 10;
        while (w3 >= 1) {
            System.out.println(w3);
            w3--;
        }

        // ===== Q9 =====
        // while文を使って 1から100までの合計を表示
        System.out.println("=== Q9 ===");
        int w4 = 1;
        int sumWhile = 0;
        while (w4 <= 100) {
            sumWhile += w4;
            w4++;
        }
        System.out.println(sumWhile);

        // ===== Q10 =====
        // 0が入力されるまで繰り返し入力を受け付ける
        System.out.println("=== Q10 ===");
        System.out.println("数値を入力してください（0で終了）:");

        while (true) {
            int input = sc.nextInt();

            if (input == 0) {
                System.out.println("終了しました");
                break;
            }

            System.out.println("入力値: " + input);
            System.out.println("続けて入力してください（0で終了）:");
        }

        sc.nextLine(); // 改行対策

        // ===== Q11 =====
        // for文を使って九九表を出力
        System.out.println("=== Q11 ===");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(
                    String.format("%02d * %02d = %02d", i, j, i * j)
                );

                if (j != 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println();
        }

        // ===== Q12 =====
        // 商品の残り台数を表示するシステム
        System.out.println("=== Q12 ===");
        System.out.println("商品名を「、」区切りで入力してください：");

        String line = sc.nextLine();
        String[] items = line.split("、");

        int tvStock = rand.nextInt(12);
        int displayStock = 11 - tvStock;

        // 拡張for文で処理
        for (String raw : items) {

            String item = raw.trim();

            switch (item) {

                case "パソコン":
                    System.out.println("パソコンの残り台数は " + rand.nextInt(12) + "台です");
                    break;

                case "冷蔵庫":
                    System.out.println("冷蔵庫の残り台数は " + rand.nextInt(12) + "台です");
                    break;

                case "扇風機":
                    System.out.println("扇風機の残り台数は " + rand.nextInt(12) + "台です");
                    break;

                case "洗濯機":
                    System.out.println("洗濯機の残り台数は " + rand.nextInt(12) + "台です");
                    break;

                case "加湿器":
                    System.out.println("加湿器の残り台数は " + rand.nextInt(12) + "台です");
                    break;

                case "テレビ":
                case "ディスプレイ":
                    int stock = item.equals("テレビ") ? tvStock : displayStock;
                    System.out.println(item + "の残り台数は " + stock + "台です");
                    break;

                default:
                    System.out.println("『 " + item + " 』は指定の商品ではありません");
                    break;
            }
        }

        sc.close();
    }
}