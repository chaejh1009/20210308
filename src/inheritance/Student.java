package inheritance;

public class Student extends Person {
	public int grade;
	public String major;
	
	// 오버라이딩은 부모쪽 메서드의 이름을 그대로 작성하고
	// 내부로직만 바꾸면 됩니다.
	// grade와 major를 추가로 조회하는 getInfo를 작성해주세요.
	@Override
	public void getInfo() {
		System.out.println("이름 :" + name);
		System.out.println("직업 :" + job);
		System.out.println("나이 :" + age);
		System.out.println("폰번호 :" + pnum);
		System.out.println("학년 :" + grade);
		System.out.println("전공 :" + major);
	}
	
	public void getInfo(String finish) {
		System.out.println("이름 :" + name);
		System.out.println("직업 :" + job);
		System.out.println("나이 :" + age);
		System.out.println("폰번호 :" + pnum);
		System.out.println("학년 :" + grade);
		System.out.println("전공 :" + major);
		System.out.println(finish);
	}
	
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
