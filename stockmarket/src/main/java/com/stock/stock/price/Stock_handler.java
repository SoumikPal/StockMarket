package com.stock.stock.price;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin()
@RestController
public class Stock_handler {
	
	@Autowired
	private Stock_service ses;
	
	/**
	 * Add a stock
	 * localhost:8080/stock
	 * @return 
	 */
	@RequestMapping(method=RequestMethod.POST,value="/stock")
	public void addStock(@RequestBody Stock s) {
		ses.addStock(s);
	}
	
	/**
	 * Get particular a stock with stock id
	 * localhost:8080/stock/{id}
	 * @return 
	 */
	@RequestMapping("/stock/{id}")
	public Optional<Stock> getStock(@PathVariable int id) {
		return ses.getStock(id);
	}
	/**
	 * Get all stocks of a company
	 * localhost:8080/stock/stockbycompanyid/{id}
	 * @return 
	 */
	@RequestMapping("/stock/stockbycompanyid/{id}")
	public ArrayList<Stock> getStockByCompanyid(@PathVariable int id) {
		return ses.getStockByCompany(id);
	}
	/**
	 * Get all stocks of a particular stock exchange
	 * localhost:8080/stock/stockbyexchangeid/{id}
	 * @return 
	 */
	@RequestMapping("/stock/stockbyexchangeid/{id}")
	public ArrayList<Stock> getStockByExchangeid(@PathVariable int id) {
		return ses.getStockByExchange(id);
	}
}