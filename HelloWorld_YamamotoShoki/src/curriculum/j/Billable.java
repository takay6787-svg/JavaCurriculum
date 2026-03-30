package curriculum.j;

/**
 * Billableインターフェイス
 * 日給計算を表すインターフェイス
 */
public interface Billable {

    /**
     * 日給を計算するメソッド
     * @param hoursWorked 勤務時間
     * @return 日給
     */
    int costForDay(int hoursWorked);
}