package threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMain {
public void runTest() {
	try {
		ExecutorService tExecute=Executors.newSingleThreadExecutor();
		System.out.println("Starting main");
		Future<String>future=tExecute.submit(new CallableApp());
		Thread.sleep(1000);
		System.out.println("Result for future");
		String result=future.get();
		System.out.println("the result is"+result);
		tExecute.shutdown();
		
	}catch (Exception e) {
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
CallableMain cm=new CallableMain();
cm.runTest();
	}

}
