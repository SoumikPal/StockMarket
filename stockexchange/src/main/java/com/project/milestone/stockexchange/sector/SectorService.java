package com.project.milestone.stockexchange.sector;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.milestone.stockexchange.entity.Company;

@Service
public class SectorService {
	@Autowired
	private SectorRepository sectorRepository;
	
	public List<Sector> getSectors(){
		List<Sector> sectors =new ArrayList<>();
		sectorRepository.findAll().forEach(sectors::add);
		return sectors;
	}
	
	public void addSectorOfCompany(Sector sector) {
		sectorRepository.save(sector);
	}
	
	public void deleteSectorById(Long id) {
		sectorRepository.deleteById(id);
	}
	
	
	
	

}
