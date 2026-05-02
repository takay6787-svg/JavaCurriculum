package curriculum.d;

public class Character {

	private String name;
	private int hp;
	private int at;
	private int sp;

	// キャラクター情報を設定する
	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	// 名前を返す
	public String getName() {
		return name;
	}

	// HPを返す
	public int getHp() {
		return hp;
	}

	// 攻撃力を返す
	public int getAt() {
		return at;
	}

	// スピードを返す
	public int getSp() {
		return sp;
	}

	// HPを設定する
	public void setHp(int hp) {
		this.hp = hp;
	}

	// 生きているか確認する
	public boolean isAlive() {
		return hp > 0;
	}

	// ステータスを返す
	public String getStatus() {
		return name + " HP:" + hp + " AT:" + at + " SP:" + sp;
	}
}