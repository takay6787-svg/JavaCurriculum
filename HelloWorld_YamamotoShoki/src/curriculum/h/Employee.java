package curriculum.h;

/**
 * Employee抽象クラス
 * 社員共通の情報と日給計算メソッドを持つクラス
 */
public abstract class Employee {

    // 社員ID
    private String employeeId;

    // 名前
    private String name;

    /**
     * コンストラクタ
     * @param id 社員ID
     * @param name 名前
     */
    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    /**
     * 社員IDを取得するメソッド
     * @return 社員ID
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 名前を取得するメソッド
     * @return 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 日給を計算する抽象メソッド
     * @param hoursWorked 勤務時間
     * @return 日給
     */
    public abstract int calculateDailyWage(int hoursWorked);
}