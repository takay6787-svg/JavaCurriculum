package curriculum.i;

/**
 * FullTimeEmployeeクラス
 * 正社員の日給を計算するクラス
 */
public class FullTimeEmployee extends Employee {

    /**
     * コンストラクタ
     * @param id 社員ID
     * @param name 名前
     */
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    /**
     * 日給を計算するメソッド
     * @param hoursWorked 勤務時間
     * @return 日給
     */
    @Override
    public int calculateDailyWage(int hoursWorked) {
        int hourlyRate = 1250;
        int overtime = Math.max(0, hoursWorked - 8);
        int regularHours = hoursWorked - overtime;
        return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
    }
}