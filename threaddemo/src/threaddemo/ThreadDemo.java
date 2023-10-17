package threaddemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExecutorService ex=Executors.newFixedThreadPool(5);
RunnableApp rp=new RunnableApp();

ex.execute(rp);
ex.execute(rp);
ex.execute(rp);
ex.execute(rp);
ex.execute(rp);
ex.execute(rp);
ex.execute(rp);
ex.shutdown();
//ex.execute(rp);

//after shutdown no new tasks would be done
//still waiting for some other process to work
	}

	

}
