package stockapp;

import java.util.List;

public class Portfolio {
private StockService stockservice;
private List<Stock>stocks;
public StockService getStockservice() {
	return stockservice;
}
public void setStockservice(StockService stockservice) {
	this.stockservice = stockservice;
}
public List<Stock> getStocks() {
	return stocks;
}
public void setStocks(List<Stock> stocks) {
	this.stocks = stocks;
}


public double getMarketValue() {
	double marketvalue=0.0;
	for(Stock stock:stocks) {
		marketvalue+=stockservice.getPrice(stock)*stock.getQuantity();
		
	}
	return marketvalue;
}

}
