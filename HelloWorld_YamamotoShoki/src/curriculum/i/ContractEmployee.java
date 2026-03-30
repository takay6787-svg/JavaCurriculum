package curriculum.i;

/**
 * ContractEmployeeクラス
 * 契約社員の日給を計算するクラス
 */
public class ContractEmployee extends Employee {

    /**
     * コンストラクタ
     * @param id 社員ID
     * @param name 名前
     */
    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    /**
     * 日給を計算するメソッド
     * @param hoursWorked 勤務時間
     * @return 日給
     */
    @Override
    public int calculateDailyWage(int hoursWorked) {
        int hourlyRate = 1000;
        return hoursWorked * hourlyRate;
    }
}