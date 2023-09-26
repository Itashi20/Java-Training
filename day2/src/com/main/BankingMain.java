package com.main;
import com.impl.PublicSectorBank;
import com.impl.PrivateSectorBank;
import com.model.Banking;
import com.template.RBI;
public class BankingMain {
//static {
//	PublicSectorBank psb=new PublicSectorBank;
//	psb.withDrawService(banking);
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PublicSectorBank psb=new PublicSectorBank();
		//psb.withDrawService(new banking (101,100));
		//psb.printBalance();
		
		Banking bn=new Banking(101, 88878.99);
		// PublicSectorBank psb=new PublicSectorBank();
		RBI psb =new PublicSectorBank();
	       psb.withDrawService(bn);
	       psb.printBalance();
	       
	       Banking bn2=new Banking(101,3330.2);
	       RBI pri =new PrivateSectorBank();  //dynamic polymorphism
	       pri.withDrawService(bn2);
	       pri.printBalance();
	       
		

	}

}
