package com.stock.stockmarket.stock;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Stock_handler {
	
	@Autowired
	private Stock_service ses;
	
	
	/**
	 * Get particular a stock with stock id
	 * localhost:8080/stock/{id}
	 * @return 
	 */
	@RequestMapping("/stock/{id}")
	public Optional<Stock> getStock(@PathVariable int id) {
		return ses.getStock(id);
	}
	@RequestMapping("/abc")
	public String hi() {
		return "hello";
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
	/**
	 * Add a stock
	 * localhost:8080/stock
	 * @return 
	 */

	@RequestMapping(method=RequestMethod.POST,value="/stock")
	public void addStock(@RequestBody Stock s) {
		s.setDate_time(LocalDateTime.now());
		s.setDate(new Date());
		ses.addStock(s);
	}
}