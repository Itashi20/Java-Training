package app1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos=new FileOutputStream("C:\\sdata.txt");
		}
		catch(FileNotFoundException e) {
			// e.printStackTrace();
		}
		
	}

}
