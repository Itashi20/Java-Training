package app2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public void addEmployee(Employee employee) throws SomethingWentWrongException {
	 
		try {
			FileOutputStream fos=new FileOutputStream("E:\\sdata.txt");
		} catch (FileNotFoundException e) {
			 throw new SomethingWentWrongException("OOPSsomething went wrong...!",e);
		}
	 
		
	}

}
