package com.cart;

import java.util.ArrayList;

public class ShoppingCart {
private ArrayList<Product>al;

public ShoppingCart(ArrayList<Product>al) {
//public ShoppingCart() {
	super();
	this.al=al;
}

public int getItemCount() {
	return al.size();
}


public void addItem(Product product) {
	al.add(product);
}



public void removeItem(String title) {
	// TODO Auto-generated method stub
	for(int i=0;i<al.size();i++) {
		if(al.indexOf(i).getTitle()==title) {
			al.remove(i);
		}
	}
	
}

}
