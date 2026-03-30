package curriculum.k;

/**
 * SalaryReporterクラス
 * 給与を表示するクラス
 */
public class SalaryReporter {

    /**
     * 給与レポートを表示するメソッド
     * @param payable 給与計算可能なオブジェクト
     */
    public void report(Payable payable) {
        System.out.println(payable.getName() + " の給料は " + payable.calculateSalary() + " 円");
    }
}