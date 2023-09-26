package com.template;

import com.model.Banking;
public abstract class RBI {
public abstract void withDrawService(Banking banking);
public abstract void printBalance();
public void issueCard() {
	System.out.println("NO COMP");
}
}
