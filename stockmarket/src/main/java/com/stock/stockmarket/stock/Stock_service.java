package com.stock.stockmarket.stock;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stock_service {

	@Autowired
	private Stock_repository ser;
	
	
	public void addStock(Stock s) {
		ser.save(s);
		
	}

	public Optional<Stock> getStock(int id) {
		return ser.findById(id);
	}
	
	public ArrayList<Stock> getStockByCompany(int id) {
		ArrayList<Stock> bycompany=new ArrayList<Stock>();
		ArrayList<Stock> all=new ArrayList<Stock>();
		ser.findAll().forEach(all::add);
		for(int i=0;i<all.size();i++) {
			if(all.get(i).getCompany_id()==id) {
				bycompany.add(all.get(i));
			}
		}
		return bycompany;
	}

	public ArrayList<Stock> getStockByExchange(int id) {
		ArrayList<Stock> bycompany=new ArrayList<Stock>();
		ArrayList<Stock> all=new ArrayList<Stock>();
		ser.findAll().forEach(all::add);
		for(int i=0;i<all.size();i++) {
			for(Integer a: all.get(i).getStock_exchange()) {
				if(a==id) {
					bycompany.add(all.get(i));
					break;
				}
			}
		}
		return bycompany;
	} 
}
