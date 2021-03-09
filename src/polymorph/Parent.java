package polymorph;

public class Parent {
	private int num;
	
	public Parent() {
		this.num = 1;
	}
	
	public void showNum() {
		System.out.println("부모의 showNum입니다.");
		System.out.println(this.num);
		System.out.println("=============");
	}
	
	public int getNum() {
		return this.num;
	}
}
