package curriculum.j;

/**
 * Employee抽象クラス
 * 社員共通の情報を持つクラス
 */
public abstract class Employee implements Billable {

    protected String id;
    protected String name;

    /**
     * コンストラクタ
     * @param id 社員ID
     * @param name 名前
     */
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
}