package threaddemo;

public class RunnableApp implements Runnable {

	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("name "+i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}
}
