package object;

public class Magician {

	public int level;
	public int mp;
	public int def;
	public int gold;
	public String id;
	
	public Magician(String userId) {
		level = 1;
		mp = 20;
		def = 1;
		gold = 200;
		id = userId;
	}
	
	public void getStatus() {
		System.out.println("아이디: " + id);
		System.out.println("레벨: " + level);
		System.out.println("마력: " + mp);
		System.out.println("방어력: " + def);
		System.out.println("소지골드: " + gold);
	}
	
	// 구조체 로직과 비슷하게 사냥하기 기능을 추가해주세요.
	public void huntMonster() {
		System.out.println("사냥을 시작합니다.");
		mp -= 5;
		level += 1;
	}
	
	public void meditation() {
		mp = 20;
	}
	
}
