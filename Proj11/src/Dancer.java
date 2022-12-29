public class Dancer extends Character {
	String name = "トム";
	Matango mHp = new Matango(100);
	public void dance() {
		System.out.println(this.name + "は情熱的に踊った");
	}
	public void attack(Matango hp) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		mHp.hp -= 3;
	}
}