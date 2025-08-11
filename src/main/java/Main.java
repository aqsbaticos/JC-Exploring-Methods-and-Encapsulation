import as.Account;
import as.SmartDoor;
import car.Car;
import display.Display;
import parameter.ParameterPassing;
import parameter.Student;
import pizza.Computer;
import pizza.Pizza;
import utility.Converter;
import utility.Utility;
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

		//	[5] STATIC METHODS AND VARIABLES
//		System.out.println("App Name: " + Utility.getAppName());
//		Utility utilInstance = new Utility();
//		System.out.println("Instance ID: " + utilInstance.getInstanceId());

//		double celsius = 25.0;
//		System.out.printf("%.1f degrees C is %.1f degrees F.\n", celsius, Converter.celsiusToFahrenheit(celsius));

		//	[6] METHOD OVERLOADING
//		Display d = new Display();
//		d.show(42);
//		d.show("Hello");
//		d.show("Goodbye", 3);

//		double celsius = 25.0;
//		System.out.printf("%.1f degrees C is %.1f degrees F.\n", celsius, Converter.celsiusToFahrenheit(celsius));
//		System.out.printf("%.1f degrees F is %.1f degrees C.\n", Converter.celsiusToFahrenheit(celsius, false), Converter.celsiusToFahrenheit(celsius, true));

		//	[7] CONSTRUCTORS AND CONSTRUCTOR OVERLOADING
//		Pizza pizza1 = new Pizza();
//		pizza1.display();
//
//		Pizza pizza2 = new Pizza("Pepperoni");
//		pizza2.display();
//
//		Pizza pizza3 = new Pizza("Mushroom and Onion", 16);
//		pizza3.display();

		Computer computer1 = new Computer();
		computer1.display(1);

		Computer computer2 = new Computer("Dell");
		computer2.display(2);

		Computer computer3 = new Computer("Apple", 16);
		computer3.display(3);

	}

	static void changeStudentName(Student student, String newName) {
		student.setName(newName);
	}


}