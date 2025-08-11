import as.Account;
import as.SmartDoor;
import car.Car;
import parameter.ParameterPassing;
import parameter.Student;
import vars.VarargsExample;

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

//		Student student = new Student("Alex");
//		System.out.println("Name before change: " + student.getName());
//		changeStudentName(student, "Jordan");
//		System.out.println("Name after change: " + student.getName());

		//	[3] USING VARARGS
//		VarargsExample.printMessages("Hello", "World");
//		VarargsExample.printMessages("Testing", "Varargs", "Here");
//		VarargsExample.printMessages();

//		System.out.println(VarargsExample.findLargest(10, 5, 25, 15));
//		System.out.println(VarargsExample.findLargest(-5, -1, -10));
//		System.out.println(VarargsExample.findLargest());

		//	[4] ACCESS SPECIFIERS
//		Account myAccount = new Account();
//		myAccount.displayAccountDetails();

//		SmartDoor smartDoor = new SmartDoor();
//		System.out.print("Is the door locked? "); System.out.println(smartDoor.isLocked());
//		smartDoor.lockDoor();
//		System.out.print("Is the door locked? "); System.out.println(smartDoor.isLocked());
//		smartDoor.unlockDoor();
//		System.out.print("Is the door locked? "); System.out.println(smartDoor.isLocked());

	}

	static void changeStudentName(Student student, String newName) {
		student.setName(newName);
	}


}