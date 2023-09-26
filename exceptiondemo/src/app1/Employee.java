package app1;
public class Employee {
	private String role;
	private String city;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(String role, String city) {
		super();
		this.role = role;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [role=" + role + ", city=" + city + "]";
	}

}
