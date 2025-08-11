import car.Car;
import parameter.ParameterPassing;
import parameter.Student;

public class Main {

	public static void main(String[] args) {

		//	[1] DESIGNING METHODS
//		Car myCar = new Car();
//		myCar.startEngine();
//		String status = myCar.drive(60);
//		System.out.println(status);
//		myCar.turnOffEngine();

		//	[2] PASSING PARAMETERS: PRIMITIVES VS OBJECTS
//		int originalValue = 50;
//		System.out.println("Before method call: " + originalValue);
//		ParameterPassing.modifyValue(originalValue);
//		System.out.println("After method call: " + originalValue);

		Student student = new Student("Alex");
		System.out.println("Name before change: " + student.getName());
		changeStudentName(student, "Jordan");
		System.out.println("Name after change: " + student.getName());
	}

	static void changeStudentName(Student student, String newName) {
		student.setName(newName);
	}


}