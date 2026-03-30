package curriculum.k;

/**
 * Mainクラス
 * SOLID原則を使った設計の確認を行うクラス
 */
public class Main {

    public static void main(String[] args) {

        // 社員オブジェクトを作成
        Payable fullTimeEmployee = new FullTimeEmployee("山田太郎", 8);
        Payable contractEmployee = new ContractEmployee("佐藤花子", 8);

        // レポーターを作成
        SalaryReporter reporter = new SalaryReporter();

        // 給与を表示
        reporter.report(fullTimeEmployee);
        reporter.report(contractEmployee);
    }
}