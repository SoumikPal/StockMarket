package com.project.milestone.stockexchange.entity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company,Long>  {
	public List<Company>findBySectorname(String sectorname);
}
