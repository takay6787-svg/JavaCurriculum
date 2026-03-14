package curriculum.b;

/**
 * Animalクラス
 * 動物の情報を持つクラス
 */
public class Animal {

    // フィールド
    private String name;
    private double length;
    private int speed;

    /**
     * 動物名を取得する
     * @return 動物名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 動物名を設定する
     * @param name 動物名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 体長を取得する
     * @return 体長
     */
    public double getLength() {
        return this.length;
    }

    /**
     * 体長を設定する
     * @param length 体長
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * 速度を取得する
     * @return 速度
     */
    public int getSpeed() {
        return this.speed;
    }

    /**
     * 速度を設定する
     * @param speed 速度
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}