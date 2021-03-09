package polymorph;

public class Child1 extends Parent {
	
	@Override
	public void showNum() {
		System.out.println("자식 1의 showNum입니다.");
		System.out.println(super.getNum());
		System.out.println("=============");
	}
	
	public void test() {
		System.out.println("자식 1번 테스트");
		System.out.println("---------------");
	}
}
