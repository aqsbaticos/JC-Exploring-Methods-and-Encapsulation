package thermostat;

public class User {

	private String password;

	public User(String password) {
		this.setPassword(password);
	}

	public String getPassword() { return "*".repeat(password.length()); }
	public void setPassword(String password)  {
		System.out.println("Attempting to set short password '" + password + "'...");
		if (password.length() < 7) System.out.println("Error: Password must be at least 8 characters long.");
		else this.password = password;
	}
}
