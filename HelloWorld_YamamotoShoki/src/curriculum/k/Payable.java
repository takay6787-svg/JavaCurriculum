package curriculum.k;

/**
 * Payableインターフェイス
 * 給与計算を表すインターフェイス
 */
public interface Payable {

    /**
     * 給与を計算するメソッド
     * @return 給与
     */
    int calculateSalary();

    /**
     * 名前を取得するメソッド
     * @return 名前
     */
    String getName();
}