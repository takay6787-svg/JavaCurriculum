package curriculum.a;

// Question1クラス
// Java基礎問題1を実行する処理
public class Question1 {

	// プログラムの実行開始処理
    public static void main(String[] args) {

        // Q1 各型の変数を宣言し、初期値を設定する処理

        // byte型の変数を宣言
        byte byteNum = 0;

        // short型の変数を宣言
        short shortNum = 0;

        // int型の変数を宣言
        int intNum = 0;

        // long型の変数を宣言
        long longNum = 0L;

        // float型の変数を宣言
        float floatNum = 0.0f;

        // double型の変数を宣言
        double doubleNum = 0.0;

        // char型の変数を宣言
        char letter = 'a';

        // String型の変数を宣言
        String letters = "";

        // boolean型の変数を宣言
        boolean isBoolean = false;

        
        // Q2 各変数に指定された値を代入する処理

        // byte型の変数に10を代入
        byteNum = 10;

        // short型の変数に100を代入
        shortNum = 100;

        // int型の変数に1000を代入
        intNum = 1000;

        // long型の変数に10000を代入
        longNum = 10000;

        // float型の変数に9.5fを代入
        floatNum = 9.5f;

        // double型の変数に10.5を代入
        doubleNum = 10.5;

        // char型の変数にaを代入
        letter = 'a';

        // String型の変数にハローを代入
        letters = "ハロー";

        // boolean型の変数にtrueを代入
        isBoolean = true;

        
        // Q3 値を代入した変数を用いて出力する処理

        // 11110を出力
        System.out.println(11110);

        // 20を出力
        System.out.println(20);

        // a ハロー true を出力
        System.out.println(letter + " " + letters + " " + isBoolean);

        // 11130 数字をすべて足して出力
        System.out.println(11110 + 20);

        // 10000000000 小数点以下の数字をすべて掛けて出力
        System.out.println(10L * 100 * 1000 * 10000);

        // 10.5割る100をして出力
        System.out.println(10.5 / 100);

        // 10引く100をして出力
        System.out.println(10 - 100);

        
        // Q4 nameというString型の変数を宣言し、値を代入して表示する処理

        // 名前を格納する変数を宣言
        String name = "山田太郎";

        // あいさつ文を表示
        System.out.println("こんにちは、" + name + "さん！");

        
        // Q5 ageというint型の変数を宣言し、年齢を表示する処理

        // 年齢を格納する変数を宣言
        int age = 25;

        // 年齢を表示
        System.out.println("年齢: " + age + "歳");

        
        // Q6 2つの数値を足した結果を表示する処理

        // 数値を格納する変数を宣言
        int num1 = 10;
        int num2 = 5;

        // 足し算の結果を格納
        int sum = num1 + num2;

        // 結果を表示
        System.out.println(sum);

        
        // Q7 スコアを更新して表示する処理

        // スコアを格納する変数を宣言
        int score = 80;

        // スコアに20を加える
        score = score + 20;

        // 最終スコアを表示
        System.out.println("最終スコア: " + score);

     
        // Q8 double型をint型に変換して表示する処理

        // 価格を格納する変数を宣言
        double price = 99.99;

        // int型に変換
        int intPrice = (int) price;

        // 整数価格を表示
        System.out.println("整数価格: " + intPrice);
        
        
        // Q9 String型をint型に変換して計算する処理

        // 数値文字列を格納
        String numStr = "123";

        // int型に変換
        int num = Integer.parseInt(numStr);

        // 変換後の値を使って計算し表示
        System.out.println("変換後の値: " + (num + 10));
        
        
        // Q10 int型をString型に変換して表示する処理

        // 得点を格納する変数を宣言
        int scoreNum = 50;

        // String型に変換
        String scoreNumText = String.valueOf(scoreNum);

        // 得点を表示
        System.out.println("得点: " + scoreNumText + "点");


        // Q11 条件演算子を使って大小を判定する処理

        int a = 10;
        int b = 20;

        // aがbより小さいかを条件演算子で判定
        boolean result = (a < b) ? true : false;

        // 結果を表示
        System.out.println(result);


        // Q12 条件演算子を使ってOK / NGを判定する処理

        int x = 15;

        // 条件演算子で判定
        String judge = (x >= 10) ? "OK" : "NG";

        // 結果を表示
        System.out.println(judge);

        
        // Q13 文字列を置換して表示する処理

        String text = "私はJavaが好きです。Javaは楽しい！";

        // JavaをPythonに置き換え
        String replacedText = text.replace("Java", "Python");

        // 結果を表示
        System.out.println(replacedText);
        
        
    }

}
