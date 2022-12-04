public class Hero {
	String name;
	int hp;
	Sword sword;
	
	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に5ポイントのダメージを与えた");
	}
	
	public Hero(String name) {
		this.hp = 100; //hpフィールドを100で初期化
		this.name = name; // 引数の値でnameフィールドを初期化
	}
	public Hero() {
//		this.hp = 100;
//		this.name = "ダミー";
		this("ダミー");
	}
}