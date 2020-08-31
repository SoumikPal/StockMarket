package com.project.milestone.stockexchange.sector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectorService {
	@Autowired
	private SectorRepository sectorRepository;
	
	
	
	public void addSectorOfCompany(Sector sector) {
		sectorRepository.save(sector);
	}
	
	public List<Sector> getSectorOfCompany(Long id) {
		return sectorRepository.findBycompanyId(id);
	}
	
	public void updateSectorOfCompany(Sector sector) {
		sectorRepository.save(sector);
	}
	
	public List<Sector> getCompanyInSector(String sectorname){
		return sectorRepository.findByname(sectorname);
		
	}

}
