package curriculum.h;

/**
 * PartTimeEmployeeクラス
 * パート社員の日給を計算するクラス
 */
public class PartTimeEmployee extends Employee {

    // 時給
    private static final int HOURLY_RATE = 1000;

    /**
     * コンストラクタ
     * @param id 社員ID
     * @param name 名前
     */
    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    /**
     * 日給を計算するメソッド
     * @param hoursWorked 勤務時間
     * @return 日給
     */
    @Override
    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}