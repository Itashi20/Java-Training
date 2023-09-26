package com.client;

import com.agent.Agent;
import com.agent.Agentnew;
import com.models.Banking;
import com.models.Insurance;
import com.models.Stocks;

public class Client {

	public static void main(String args[]) {
	  Banking ban=new Banking(1110,22999.89);
	  Insurance ins=new Insurance("Bike",200);
	  Stocks s=new Stocks(1,"ABC",3,70);
	  Agentnew a=new Agentnew();
	  Agent an=new Agent();
	  

	  a.withDrawService(ban);
	  a.printBalance();
	  
	  a.buypolicy(ins);
	  a.claimpolicy();
	  
	  
	  an.addStocks(s);
	  an.sellStocks();
 
	  
	
	  
	  
	}
}
