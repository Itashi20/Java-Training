package threaddemo;

//public class ChildThreadDemo extends Thread {
public class ChildThreadDemo implements Runnable {
	Thread thread;
	public ChildThreadDemo() {
		// TODO Auto-generated constructor stub
		thread=new Thread(this,"ChildThread....");
		System.out.println("Child thread is ready");
		thread.start();
	}
	public void run() {
		System.out.println("child Thread is running"+Thread.currentThread().getName());
	}
	
	

}
