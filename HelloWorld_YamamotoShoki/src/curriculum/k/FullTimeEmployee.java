package curriculum.k;

/**
 * FullTimeEmployeeクラス
 * 正社員の給与を計算するクラス
 */
public class FullTimeEmployee extends Employee {

    /**
     * コンストラクタ
     * @param name 名前
     * @param hours 勤務時間
     */
    public FullTimeEmployee(String name, int hours) {
        super(name, hours);
    }

    /**
     * 給与を計算するメソッド
     * @return 給与
     */
    @Override
    public int calculateSalary() {
        return hours * 1200;
    }
}