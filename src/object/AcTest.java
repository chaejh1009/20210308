package object;

public class AcTest {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("전사임");
		w1.getStatus();
		w1.huntMonster();
		w1.getStatus();
		w1.heal();
		w1.getStatus();
		Magician m1 = new Magician("마법사임");
		m1.huntMonster();
		m1.getStatus();
		m1.meditation();
		m1.getStatus();
		
	}

}
