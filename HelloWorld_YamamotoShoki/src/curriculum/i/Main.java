package curriculum.i;

import java.util.ArrayList;
import java.util.List;

/**
 * Mainクラス
 * ポリモーフィズムの確認を行うクラス
 */
public class Main {

    public static void main(String[] args) {

        // 社員リストを作成
        List<Employee> employees = new ArrayList<Employee>();

        // 複数の社員を追加
        employees.add(new FullTimeEmployee("E005", "山田太郎"));
        employees.add(new ContractEmployee("E006", "佐藤花子"));
        employees.add(new FullTimeEmployee("E007", "鈴木一郎"));
        employees.add(new ContractEmployee("E008", "田中美咲"));

        // for-eachで全社員の日給を表示
        for (Employee employee : employees) {
            System.out.println(employee.name + " の給料は " + employee.calculateDailyWage(9) + " 円");
        }
    }
}