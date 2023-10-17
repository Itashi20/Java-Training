package threaddemo;


class Multi extends Thread{
public void run(){
 for(int i=1;i<=5;i++){
  try{
   Thread.sleep(500);
  }catch(Exception e){System.out.println(e);}
 System.out.println(i);
 }
}
public static void main(String args[]){
Multi t1=new Multi();
Multi t2=new Multi();
Multi t3=new Multi();
t1.start();

try {
	//t1.join();
	t1.join(1500);
	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

t2.start();


try {
	//t1.join();
	t2.join();
	
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

t3.start();

}
}
