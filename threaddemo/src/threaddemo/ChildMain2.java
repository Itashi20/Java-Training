package threaddemo;

public class ChildMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread");
		ChildDemo2 d=new ChildDemo2();
		
		//Thread thread=Thread.currentThread();
		
		//System.out.println(thread);
		Thread thread=new Thread(d,"My thread");
		thread.start();
		
		
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			
			try {
				thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
