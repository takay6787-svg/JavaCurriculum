package curriculum.j;

import java.util.ArrayList;
import java.util.List;

/**
 * Mainクラス
 * インターフェイスと抽象クラスの確認を行うクラス
 */
public class Main {

    public static void main(String[] args) {

        // Billable型のリストを作成
        List<Billable> employees = new ArrayList<Billable>();

        // 社員を追加
        employees.add(new FullTimeEmployee("E009", "山田太郎"));
        employees.add(new ContractEmployee("E010", "佐藤花子"));

        // for-eachで日給を表示
        for (Billable employee : employees) {
            System.out.println("日給: " + employee.costForDay(9) + " 円");
        }
    }
}