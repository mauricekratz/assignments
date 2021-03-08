package employeeAssignment;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Alex", "alex@gmail.com", 24, 012345);
		System.out.println(e1);
		
		Employee e2 = new Employee(null, null, 35, 0);
		System.out.println(e2);
		
		Employee e3 = new Employee();
		e3.setName("Jason");
		e3.setAge(0);
		e3.setEmail(null);
		
		EmployeeProject ep1 =  new EmployeeProject();
		PresentAddress pa1 = new PresentAddress();
		
		
		

	}

}
