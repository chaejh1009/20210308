package inheritance;

public class SalaryMan extends Person {
	public int salary;
	
	@Override
	public void getInfo() {
		System.out.println("이름 :" + name);
		System.out.println("직업 :" + job);
		System.out.println("나이 :" + age);
		System.out.println("폰번호 :" + pnum);
		System.out.println("연봉 :" + salary);
	}
}
