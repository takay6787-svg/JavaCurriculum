package curriculum.i;

/**
 * Employee抽象クラス
 * 社員共通の情報を持つクラス
 */
public abstract class Employee {

    protected String id;
    protected String name;

    /**
     * コンストラクタ
     * @param id 社員ID
     * @param name 名前
     */
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * 日給を計算する抽象メソッド
     * @param hoursWorked 勤務時間
     * @return 日給
     */
    public abstract int calculateDailyWage(int hoursWorked);
}