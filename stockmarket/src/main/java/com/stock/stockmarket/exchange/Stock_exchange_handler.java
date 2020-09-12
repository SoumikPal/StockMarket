package com.stock.stockmarket.exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Stock_exchange_handler {
	private boolean invoke=false;
	@Autowired
	private Stock_exchange_service ses;
	
	/**
	 * Get all stock_exchanges
	 * localhost:8080/stockexchange
	 * @return 
	 */
	private void initialize() {
		if(!invoke) {
			ses.addStockExchange(new Stock_exchange(1,"Bombay Stock Exchange","A++", 224501));
			ses.addStockExchange(new Stock_exchange(2,"National Stock Exchange","A++", 223429));
			invoke=true;
		}
	}
	@RequestMapping("/stock_exchange")
	public List<Stock_exchange> getStockExchanges() {
		initialize();
		return ses.getStockExchanges();
	}
	/**
	 * Add a stock_exchange
	 * localhost:8080/stockexchange
	 * @return 
	 */
	@RequestMapping(method=RequestMethod.POST,value="/stock_exchange")
	public void addStockExchange(@RequestBody Stock_exchange se) {
		initialize();
		ses.addStockExchange(se);
	}
	/**
	 * Get particular a stock_exchange
	 * localhost:8080/stockexchange/{id}
	 * @return 
	 */
	@RequestMapping("/stock_exchange/{id}")
	public Optional<Stock_exchange> getStockExchange(@PathVariable int id) {
		return ses.getStockExchange(id);
	}
	
}
