package employeeAssignment;

public class Employee {

	private String name;
	private String email;
	private int age;
	private int id;
	private EmployeeProject employeeProject;
	private PresentAddress presentAddress;
	private PermanentAddress permanentAddress;
		
	

	public Employee (String name, String email, int age, int id) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setID(int id) {
		this.id = id;
	}

	public Employee (EmployeeProject employeeProject) {
		this.employeeProject = employeeProject;
	}
	
	public Employee(PresentAddress presentAddress ) {
		this.presentAddress = presentAddress;
	}
	
	public Employee (PermanentAddress permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	public Employee() {
	
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", age=" + age + ", id=" + id + ", employeeProject="
				+ employeeProject + ", presentAddress=" + presentAddress + ", permanentAddress=" + permanentAddress
				+ "]";
	}
	


	
	

	
}
