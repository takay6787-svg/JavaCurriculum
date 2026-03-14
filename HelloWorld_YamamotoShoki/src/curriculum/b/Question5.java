package curriculum.b;

/**
 * Question5クラス
 * Java基礎問題5（メソッド）の練習
 */
public class Question5 {

    public static void main(String[] args) {

        // ===== Q1 =====
        // helloWorldメソッドを呼び出す
        helloWorld();

        // ===== Q2 =====
        // 10を2倍した結果を表示
        int result = doubleValue(10);
        System.out.println("10 を 2 倍すると " + result + " です。");

        // ===== Q3 =====
        // 数字を用意する
        int num1 = 7;
        int num2 = 10;

        // num2が偶数かどうかを判定して表示
        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です。");
        } else {
            System.out.println(num2 + " は奇数です。");
        }

        // num1が偶数かどうかを判定して表示
        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です。");
        } else {
            System.out.println(num1 + " は奇数です。");
        }
    }

    /**
     * Q1
     * Hello, World! を表示するメソッド
     */
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    /**
     * Q2
     * 引数の2倍の値を返すメソッド
     * @param num 整数
     * @return 2倍した値
     */
    public static int doubleValue(int num) {
        return num * 2;
    }

    /**
     * Q3
     * 偶数かどうかを判定するメソッド
     * @param num 整数
     * @return 偶数ならtrue、奇数ならfalse
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}