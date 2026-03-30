package curriculum.k;

/**
 * Employee抽象クラス
 * 社員共通の情報を持つクラス
 */
public abstract class Employee implements Payable {

    protected String name;
    protected int hours;

    /**
     * コンストラクタ
     * @param name 名前
     * @param hours 勤務時間
     */
    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    /**
     * 名前を取得するメソッド
     * @return 名前
     */
    @Override
    public String getName() {
        return name;
    }
}