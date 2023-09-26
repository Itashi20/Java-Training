package app1;

public class MainApp {
	public static void main(String args[]) {
Employee em= new Employee("admin","Pune");
EmployeeDAO ed=new EmployeeDAOImpl();
ed.addEmployee(em);
System.out.println("Employee added");
}

}


//wrong output as the path is undefined it should throw an error but it is not showing that 
//so we need to handle exception accordingly

//best method is to create an custom exception  3rd method

//Ist is this--->showing wrong output
//2nd one we will use general file not found exception

//we should declare excetion in interface as well as class in order to get better results.
