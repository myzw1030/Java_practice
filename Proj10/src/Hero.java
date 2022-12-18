public class Hero {
	String name = "ミナト";

	// 戦う
	Matango m = new Matango(100);
	int mHp = m.hp;
	public void attack(Matango hp) {
		System.out.println(this.name + "の攻撃！");
		mHp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}
	// 逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
}