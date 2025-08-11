package pizza;

public class Computer {

	private String brand;
	private int ramInGB;

	public Computer() {
		this("Generic", 8);
	}

	public Computer(String brand) {
		this(brand, 8);
	}

	public Computer(String brand, int ramInGB) {
		this.brand = brand;
		this.ramInGB = ramInGB;
	}

	public void display(int num) {
		System.out.println("Computer " + num + ": Brand = " + this.brand + ", RAM = " + this.ramInGB + "GB");
	}
}

