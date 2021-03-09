package inheritance;

public class SuperSonicAirplane extends Airplane {

	@Override
	public void fly() {
		if(speed > 1000) {
			System.out.println("초음속 비행을 합니다.");
			System.out.println("시속 :" + speed + "km/h");	
		} else {
			super.fly();
		}
		
		
	}
	
}
