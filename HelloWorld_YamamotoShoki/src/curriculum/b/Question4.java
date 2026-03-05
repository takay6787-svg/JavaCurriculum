package curriculum.b;

import java.util.Scanner;

/**
 * Question4クラス
 * Java基礎問題4（配列）の練習
 */
public class Question4 {

    public static void main(String[] args) {

        // Scanner：キーボード入力（コンソール入力）を受け取るための道具
        Scanner sc = new Scanner(System.in);

        // ===== Q1 =====
        // int型の配列を作成し、1,2,3,4,5を格納して順番に表示
        System.out.println("=== Q1 ===");
        int[] array1 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        // ===== Q2 =====
        // 配列の要素を逆順に表示
        System.out.println("=== Q2 ===");
        int[] array2 = { 10, 20, 30, 40, 50 };
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.println(array2[i]);
        }

        // ===== Q3 =====
        // 配列の全要素の合計値を計算して表示
        System.out.println("=== Q3 ===");
        int[] array3 = { 3, 5, 7, 9, 11 };
        int sum3 = 0;
        for (int i = 0; i < array3.length; i++) {
            sum3 += array3[i];
        }
        System.out.println("合計 = " + sum3);

        // ===== Q4 =====
        // 配列の最大値と最小値を求めて表示
        System.out.println("=== Q4 ===");
        int[] array4 = { 12, 7, 9, 21, 5, 18 };
        int max4 = array4[0];
        int min4 = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] > max4) {
                max4 = array4[i];
            }
            if (array4[i] < min4) {
                min4 = array4[i];
            }
        }
        System.out.println("最大値 = " + max4);
        System.out.println("最小値 = " + min4);

        // ===== Q5 =====
        // 配列のすべての要素を2倍し、拡張for文で表示
        System.out.println("=== Q5 ===");
        int[] array5 = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array5.length; i++) {
            array5[i] *= 2;
        }
        for (int value : array5) {
            System.out.println(value);
        }

        // ===== Q6 =====
        // 入力した数が配列に含まれているか判定して表示
        System.out.println("=== Q6 ===");
        int[] array6 = { 4, 7, 10, 15, 20 };
        System.out.print("数値を入力してください：");
        int input = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] == input) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(input + "は配列に含まれています");
        } else {
            System.out.println(input + "は配列に含まれていません");
        }

        // ===== Q7 =====
        // 2次元配列のすべての要素を表示
        System.out.println("=== Q7 ===");
        int[][] array7 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                System.out.println(array7[i][j]);
            }
        }

        // ===== Q8 =====
        // 2次元配列のすべての要素の合計値を表示
        System.out.println("=== Q8 ===");
        int[][] array8 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        int sum8 = 0;
        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                sum8 += array8[i][j];
            }
        }
        System.out.println("合計 = " + sum8);

        // ===== Q9 =====
        // 2次元配列内の最大値と最小値を求めて表示
        System.out.println("=== Q9 ===");
        int[][] array9 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };

        int max9 = array9[0][0];
        int min9 = array9[0][0];
        for (int i = 0; i < array9.length; i++) {
            for (int j = 0; j < array9[i].length; j++) {
                if (array9[i][j] > max9) {
                    max9 = array9[i][j];
                }
                if (array9[i][j] < min9) {
                    min9 = array9[i][j];
                }
            }
        }
        System.out.println("最大値 = " + max9);
        System.out.println("最小値 = " + min9);

        // ===== Q10 =====
        // 3次元配列内のすべての要素を表示
        System.out.println("=== Q10 ===");
        int[][][] array10 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        for (int i = 0; i < array10.length; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                for (int k = 0; k < array10[i][j].length; k++) {
                    System.out.println(array10[i][j][k]);
                }
            }
        }

        // Scannerを閉じる
        sc.close();
    }
}