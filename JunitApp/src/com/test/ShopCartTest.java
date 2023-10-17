package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cart.Product;
import com.cart.ShoppingCart;

public class ShopCartTest {
private ShoppingCart cart;
private Product p1;
private Product p2;


@Before
public void init () {
	cart=new ShoppingCart();
	p1=new Product("JAVA BOOK",230.00);
	p1=new Product("C# BOOK",130.00);
	
	
	cart.addItem(p1);
	cart.addItem(p2);
}

@Test
public void TestAddCart() {
	Product p3=new Product("Java",230.0);
	cart.addItem(p3);
	assertEquals(3,cart.getItemCount());
}


}
