package curriculum.k;

/**
 * ContractEmployeeクラス
 * 契約社員の給与を計算するクラス
 */
public class ContractEmployee extends Employee {

    /**
     * コンストラクタ
     * @param name 名前
     * @param hours 勤務時間
     */
    public ContractEmployee(String name, int hours) {
        super(name, hours);
    }

    /**
     * 給与を計算するメソッド
     * @return 給与
     */
    @Override
    public int calculateSalary() {
        return hours * 1000;
    }
}