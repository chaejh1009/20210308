package polymorph;

public class GameMain {

	public static void main(String[] args) {
		// 전사를 생성해주세요.
		Warrior w1 = new Warrior(20, 3, 1);
		// 오크를 orc1, orc2 두 개 생성해주세요.
		Orc orc1 = new Orc();
		Orc orc2 = new Orc();
		Dragon d1 = new Dragon();
		Dragon d2 = new Dragon();
		Troll t1 = new Troll();
		Goblin g1 = new Goblin();
		// orc1에게 전사의 hunt 메서드를 적용하세요.
		w1.hunt(orc1);
		// d1에게 hunt메서드를 한 번 적용하세요.
		w1.hunt(d1);
		w1.hunt(t1);
		w1.hunt(g1);
		// 전사, orc1, orc2의 체력을 조회해주세요.
		w1.showHp();
		orc1.showHp();
		orc2.showHp();
		d1.showHp();
		t1.showHp();
		g1.showHp();
	}

}
