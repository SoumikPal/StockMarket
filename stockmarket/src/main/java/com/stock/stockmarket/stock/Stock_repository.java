package com.stock.stockmarket.stock;

import org.springframework.data.repository.CrudRepository;

public interface Stock_repository extends CrudRepository<Stock,Integer>{
	//ArrayList<Stock> findBycompany_id(int idf);
}
