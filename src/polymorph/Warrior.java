package polymorph;

public class Warrior {

	private int hp;
	private int atk;
	private int def;
	
	public Warrior(int hp, int atk, int def) {
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public void hunt(Monster monster) {
		// Warrior의 공격력만큼 Monster의 체력을 까는 로직
		int result = monster.getHp() - this.atk;
		monster.setHp(result);
		
		// monster의 공격력만큼 Warrior의 체력을 까는 로직
		result = this.hp - monster.getAtk();
		this.hp = result;
	}

	
	public void showHp() {
		System.out.println("전사의 남은 체력 : " + this.hp);
	}
}
