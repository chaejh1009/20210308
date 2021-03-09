package object;

public class Warrior {
	// 전사가 사용할 스탯을 적어주세요
	public int level;
	public int hp;
	public int atk;
	public String id;
	
	// 생성자 정의
	public Warrior(String userId) {
		System.out.println("전사 아이디 생성중입니다...");
		level = 1;
		hp = 20;
		atk = 3;
		id = userId;
	}
	
	public void getStatus() {
		System.out.println("아이디: " + id);
		System.out.println("레벨: " + level);
		System.out.println("체력: " + hp);
		System.out.println("공격력: " + atk);
	}
	
	// 구조체 로직과 비슷하게 사냥하기 기능을 추가해주세요.
	public void huntMonster() {
		System.out.println("사냥을 시작합니다.");
		hp -= 3;
		level += 1;
	}
	
	public void heal() {
		hp = 20;
	}
	
}






