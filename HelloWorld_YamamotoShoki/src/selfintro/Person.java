package selfintro;

public class Person {

    // インスタンスフィールドを定義
    String name;
    int age;
    double height;
    double weight;

    // 人数カウント
    static int count = 0;

    // コンストラクタ
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++;
    }

    // BMI計算
    double bmi() {
        return this.weight / this.height / this.height;
    }

    // 自己紹介表示
    void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
    }
}