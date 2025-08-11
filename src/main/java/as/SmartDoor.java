package as;

public class SmartDoor {

	private boolean isLocked;

	public SmartDoor() {
		this.isLocked = false;
	}

	public void lockDoor() {
		if (!isLocked) {
			System.out.println("Locking the door...");
			isLocked = true;
		}
	}

	public void unlockDoor() {
		if (isLocked) {
			System.out.println("Unlocking the door...");
			isLocked = false;
		}
	}

	public boolean isLocked() {
		return this.isLocked;
	}
}