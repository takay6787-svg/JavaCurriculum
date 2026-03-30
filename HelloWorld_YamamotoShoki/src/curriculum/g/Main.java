package curriculum.g;

/**
 * Mainクラス
 * Employeeクラスのカプセル化を確認するクラス
 */
public class Main {

    public static void main(String[] args) {

        // Employeeクラスのオブジェクトを作成
        Employee employee = new Employee();

        // setterで値を設定
        employee.setEmployeeId("E002");
        employee.setName("田中花子");

        // getterで値を取得して表示
        System.out.println("社員ID: " + employee.getEmployeeId() + ", 名前: " + employee.getName());
    }
}