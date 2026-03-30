package curriculum.f;

/**
 * Employeeクラス
 * 社員IDと名前を管理するクラス
 */
public class Employee {

    // 社員ID
    String employeeId;

    // 名前
    String name;

    /**
     * 社員情報を表示するメソッド
     */
    public void showInfo() {
        System.out.println("社員ID: " + employeeId + ", 名前: " + name);
    }
}