package com.agent;

import com.inter.RBI;
import com.inter.SEBI;
import com.models.Banking;
import com.models.Insurance;
import com.models.Stocks;

public class Agent implements SEBI,RBI {
	Insurance insu=new Insurance();
	Banking b=new Banking();
     Stocks s=new Stocks();
	@Override
	public void addStocks(Stocks st) {
		// TODO Auto-generated method stub
		s.setPrice(st.getPrice());
		
		
		
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		System.out.println(s.getPrice());
		
	}

	public void withDrawService(Banking banking) {
		// TODO Auto-generated method stub
		b.setAccNo(banking.getAccNo());
		b.setBalance(banking.getBalance());
		
	}

	@Override
	public void printBalance() {
		// TODO Auto-generated method stub
		System.out.println(b.getBalance());
		
	}

}


