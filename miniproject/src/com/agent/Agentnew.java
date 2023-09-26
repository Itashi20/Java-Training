package com.agent;

import com.inter.IRDA;
import com.inter.RBI;
import com.models.Banking;
import com.models.Insurance;

public class Agentnew implements RBI,IRDA{
	
	Insurance insu=new Insurance();
	Banking b=new Banking();

	@Override
	public void buypolicy(Insurance ins) {
		// TODO Auto-generated method stub
		insu.setInsuranceType(ins.getInsuranceType());
		insu.setPremium(ins.getPremium());
		
	}

	@Override
	public void claimpolicy() {
		// TODO Auto-generated method stub
		System.out.println(insu.getInsuranceType()+"claimed ");
		
	}

	@Override
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
