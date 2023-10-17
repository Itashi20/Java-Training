package com.cart;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

//import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingTest {
ArrayList<Product> al = new ArrayList<>();
ShoppingCart sCart = new ShoppingCart(al);
	
@BeforeEach
public void init() {
	sCart.addItem(new Product("Bottle",34));
	sCart.addItem(new Product("Ball",30));
}

@Test
public void testSCart() {
	sCart.addItem(new Product("pen",23));
	assertEquals(3,sCart.getItemCount());
}
}
