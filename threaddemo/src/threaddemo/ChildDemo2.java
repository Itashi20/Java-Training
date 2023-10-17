package threaddemo;

public class ChildDemo2 implements Runnable{
	Thread thread;
//	public ChildDemo2(){
//	thread=new Thread(this,"ChildThread....");
//	System.out.println("Child thread is ready");
//	thread.start();}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=5;i>=0;i--) {
			System.out.println(i);
			try {
				thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	

}
