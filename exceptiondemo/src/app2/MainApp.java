package app2;

import java.io.FileNotFoundException;

public class MainApp {

	public static void main(String[] args) {
		Employee em=new Employee("admin", "Pune");
		 EmployeeDAO ed=new EmployeeDAOImpl();
		 try {
			ed.addEmployee(em);
		} catch (SomethingWentWrongException e) {
			 
			 System.out.println(e.getMessage());
		}
		 System.out.println("EMployee Added");

	}

}

