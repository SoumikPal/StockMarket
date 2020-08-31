package com.stock.stock.price;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface Stock_repository extends CrudRepository<Stock,Integer>{
	ArrayList<Stock> findBycompany_id(@Param("company_id") Integer company_id);

	ArrayList<Stock> findByexchange_id(@Param("stock_exchange") Integer stock_exchange);
}
