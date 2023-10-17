package threaddemo;

import java.util.concurrent.Callable;

public class CallableApp implements Callable<String> {
	
	public String call() {
		System.out.println("inside call method");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("completed call method");
		return "finished";
	}
	

}
