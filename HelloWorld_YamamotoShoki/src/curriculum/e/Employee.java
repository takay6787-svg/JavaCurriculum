package curriculum.e;

/**
 * Employeeクラス
 * 社員の名前を持ち、働く動作を表すクラス
 */
public class Employee {

    // 名前
    String name;

    /**
     * 働くメソッド
     */
    public void work() {
        System.out.println(name + "は働いています。");
    }
}