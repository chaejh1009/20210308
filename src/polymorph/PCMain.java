package polymorph;

public class PCMain {

	public static void getPc(Parent parent) {
		parent.showNum();
		//parent.test();
	}
	
	public static void main(String[] args) {
		// 하단에 child1(Child1타입)
		// child2(Child2타입)
		// parent(Parent타입) 을 생성해주세요.
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		Parent parent = new Parent();
		getPc(child2);
	}

}
