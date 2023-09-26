package com.impl;

import com.model.Banking;
import com.template.RBI;

public class PrivateSectorBank extends RBI {
Banking bank=new Banking();


public void withDrawService(Banking banking) {
	 bank.setAccNo(banking.getAccNo());
	 bank.setBalance(banking.getBalance());
	
}


public void printBalance() {
	//System.out.println(bank.getBalance());
	System.out.println(bank);
}
}
