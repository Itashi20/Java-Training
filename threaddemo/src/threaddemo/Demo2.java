package threaddemo;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread thread=Thread.currentThread();
System.out.println(thread);
thread.setName("new main");
System.out.println(thread);
thread.setPriority(Thread.MAX_PRIORITY);
thread.setPriority(7);

System.out.println(thread);


	}
	
	

}
