package threaddemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sleep automatically calls interrrupted exception
		try {
			System.out.println("welcome");
			Thread.sleep(1000);
			System.out.println("to");
			Thread.sleep(1000);
			
			System.out.println("java");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//threads is called by scheduler and it has a lifecycle.
		

	}

}
