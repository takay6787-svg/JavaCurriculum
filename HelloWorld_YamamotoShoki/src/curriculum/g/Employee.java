package curriculum.g;

/**
 * Employeeクラス
 * カプセル化を使って社員情報を管理するクラス
 */
public class Employee {

    // 社員ID
    private String employeeId;

    // 名前
    private String name;

    /**
     * 社員IDを設定するメソッド
     * @param id 社員ID
     */
    public void setEmployeeId(String id) {
        employeeId = id;
    }

    /**
     * 社員IDを取得するメソッド
     * @return 社員ID
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * 名前を設定するメソッド
     * @param name 名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 名前を取得するメソッド
     * @return 名前
     */
    public String getName() {
        return name;
    }
}