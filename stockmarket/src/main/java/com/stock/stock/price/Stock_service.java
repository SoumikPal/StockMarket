package com.stock.stock.price;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stock_service {

	@Autowired
	private Stock_repository ser;
	
	Stock_service(){
	}
	
	public void addStock(Stock s) {
		ser.save(s);
		
	}

	public Optional<Stock> getStock(int id) {
		return ser.findById(id);
	}
	
	public ArrayList<Stock> getStockByCompany(int id) {
		return ser.findBycompany_id(id);
	}

	public ArrayList<Stock> getStockByExchange(int id) {
		return ser.findByexchange_id(id);
	} 
}
