package curriculum.h;

/**
 * FullTimeEmployeeクラス
 * 正社員の日給を計算するクラス
 */
public class FullTimeEmployee extends Employee {

    // 時給
    private static final int HOURLY_RATE = 1200;

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
     * 8時間を超えた分は25%割増
     * @param hoursWorked 勤務時間
     * @return 日給
     */
    @Override
    public int calculateDailyWage(int hoursWorked) {
        if (hoursWorked <= 8) {
            return hoursWorked * HOURLY_RATE;
        } else {
            int regularPay = 8 * HOURLY_RATE;
            int overtimeHours = hoursWorked - 8;
            int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);
            return regularPay + overtimePay;
        }
    }
}