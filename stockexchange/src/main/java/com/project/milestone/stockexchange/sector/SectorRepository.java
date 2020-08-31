package com.project.milestone.stockexchange.sector;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SectorRepository extends CrudRepository<Sector,Long>  {
	public List<Sector> findBycompanyId(Long id);
	public List<Sector> findByname(String name);
	
}
