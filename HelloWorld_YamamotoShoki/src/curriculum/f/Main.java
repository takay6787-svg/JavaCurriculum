package curriculum.f;

/**
 * Mainクラス
 * Employeeクラスの確認を行うクラス
 */
public class Main {

    public static void main(String[] args) {

        // Employeeクラスのオブジェクトを作成
        Employee employee = new Employee();

        // 値を設定
        employee.employeeId = "E001";
        employee.name = "佐藤太郎";

        // 情報を表示
        employee.showInfo();
    }
}