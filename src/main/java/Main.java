import car.Car;

public class Main {

	public static void main(String[] args) {

		//	[1] DESIGNING METHODS
		Car myCar = new Car();
		myCar.startEngine();
		String status = myCar.drive(60);
		System.out.println(status);
	}
}