package com.stock.stockmarket.exchange;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stock_exchange_service {
	
	@Autowired
	private Stock_exchange_repository ser;
	
	public ArrayList<Stock_exchange> getStockExchanges() {
		ArrayList<Stock_exchange> stockList=new ArrayList<Stock_exchange>();
		ser.findAll().forEach(stockList::add);
		return stockList;
	}
	public void addStockExchange(Stock_exchange se) {
		ser.save(se);
	}
	public Optional<Stock_exchange> getStockExchange(Integer id) {
		return ser.findById(id);
	}
	
}
