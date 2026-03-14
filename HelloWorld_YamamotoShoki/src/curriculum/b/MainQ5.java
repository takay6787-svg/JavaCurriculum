package curriculum.b;

/**
 * MainQ5クラス
 * Animalクラスの情報を設定して表示する
 */
public class MainQ5 {

    public static void main(String[] args) {

        // Animalクラスのオブジェクトを作る
        Animal animal = new Animal();

        // 値を設定
        animal.setName("ライオン");
        animal.setLength(2.1);
        animal.setSpeed(80);

        // 値を取得して表示
        System.out.println("動物名：" + animal.getName());
        System.out.println("体長：" + animal.getLength() + "m");
        System.out.println("速度：" + animal.getSpeed() + "km/h");

    }
}