import java.util.Random;
public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間祈った");
		
		// MPを回復
		int recovery = new Random().nextInt(3) + sec; 
		// 実際の回復
		int actualRecovery = Math.min(this.MAX_MP - this.mp, recovery);
		
		System.out.println(this.name + "は" + actualRecovery + "回復した");
		return actualRecovery;
	}
}