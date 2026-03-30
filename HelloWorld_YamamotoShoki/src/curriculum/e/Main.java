package curriculum.e;

/**
 * Mainクラス
 * Employeeクラスの動作確認を行うクラス
 */
public class Main {

    public static void main(String[] args) {

        // Employeeクラスのオブジェクトを作成
        Employee employee = new Employee();

        // 名前を設定
        employee.name = "山田太郎";

        // workメソッドを呼び出す
        employee.work();
    }
}