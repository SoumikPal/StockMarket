package com.project.milestone.stockexchange.ipo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IpoRepository extends CrudRepository<Ipo,Long>  {
	public List<Ipo> findByCompanyid(Long comapny_id);
	public void deleteByCompanyid(Long company_id);
	
}
