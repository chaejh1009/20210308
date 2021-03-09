package inheritance;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student();
		SalaryMan sm1 = new SalaryMan();
		
		st1.age=23;
		st1.grade=3;
		st1.job="학생";
		st1.major="컴공";
		st1.name="김학생";
		st1.pnum="010-1111-1111";
		sm1.age=30;
		sm1.job="개발자";
		sm1.name="김개발";
		sm1.pnum="010-9999-9999";
		sm1.salary=4000;
		st1.setGrade(4);
		st1.getInfo("--------------------");
		sm1.getInfo();
		//System.out.println(System.identityHashCode(st1.age));
	}

}
