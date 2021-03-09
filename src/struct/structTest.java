package struct;

public class structTest {
	
	// 아래 메서드를 완성시켜주세요.
	// structEx 타입 자료를 입력받아 4개의 변수를
	// 전부 콘솔창에 찍어줍니다.
	public static void getWarriorStatus(structEx ac) {
		System.out.println("전사 아이디 조회중...");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("체력 : " + ac.hp);
		System.out.println("공격력 : " + ac.atk);
	}
	public static void getMagicianStatus(Magician ac) {
		System.out.println("마법사 아이디 조회중...");
		System.out.println("아이디 : " + ac.id);
		System.out.println("레벨 : " + ac.level);
		System.out.println("마나 : " + ac.mana);
		System.out.println("방어력 : " + ac.def);
	}
	
	//전사에게 몬스터 사냥기능 추가
	public static void huntMonster(structEx ac) {
		System.out.println("전사가 몬스터를 잡습니다.");
		ac.hp -= 3;
		ac.level += 1;
	}

	public static void main(String[] args) {
		structEx w1 = new structEx();
		// w1 내부 변수에 임의의 값을 부여해주세요.
		w1.atk = 3;
		w1.hp = 20;
		w1.level = 1;
		w1.id = "전사1";
		getWarriorStatus(w1);
		huntMonster(w1);
		getWarriorStatus(w1);
		huntMonster(w1);
		getWarriorStatus(w1);
		
		
	}

}
