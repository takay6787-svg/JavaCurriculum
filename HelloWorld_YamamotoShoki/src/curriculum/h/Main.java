package curriculum.h;

/**
 * Mainクラス
 * 継承と抽象クラスの確認を行うクラス
 */
public class Main {

    public static void main(String[] args) {

        // 正社員オブジェクトを作成
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("E003", "山田太郎");

        // パート社員オブジェクトを作成
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("E004", "佐藤花子");

        // 9時間勤務の日給を表示
        System.out.println("正社員の給与: " + fullTimeEmployee.calculateDailyWage(9) + " 円");
        System.out.println("パート社員の給与: " + partTimeEmployee.calculateDailyWage(9) + " 円");
    }
}