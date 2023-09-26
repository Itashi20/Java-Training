package com.models;

public class Stocks {
private int stockid;
private String stockname;
private int qty;
private int price;
public int getStockid() {
	return stockid;
}
public void setStockid(int stockid) {
	this.stockid = stockid;
}
public String getStockname() {
	return stockname;
}
public void setStockname(String stockname) {
	this.stockname = stockname;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Stocks [stockid=" + stockid + ", stockname=" + stockname + ", qty=" + qty + ", price=" + price + "]";
}
public Stocks(int stockid, String stockname, int qty, int price) {
	super();
	this.stockid = stockid;
	this.stockname = stockname;
	this.qty = qty;
	this.price = price;
}
public Stocks() {
	super();
	// TODO Auto-generated constructor stub
}


}
