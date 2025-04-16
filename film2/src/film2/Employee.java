package film2;

public class Employee {
	private String name;
	private String role;
	
	Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	
	String getName() {
		return name;
	}
	
	String getRole() {
		return role;
	}
}