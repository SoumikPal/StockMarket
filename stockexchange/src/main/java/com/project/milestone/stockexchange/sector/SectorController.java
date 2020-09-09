package com.project.milestone.stockexchange.sector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectorController {
	@Autowired
	private SectorService sectorService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/company/sector")
	public List<Sector> getSector() {
		return sectorService.getSectors();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.POST, value = "/company/sector")
	public void addSectorOfCompany(@RequestBody Sector sector) {
		//sector.setCompanyId(id);
		sectorService.addSectorOfCompany(sector);

	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.DELETE, value = "/company/sector/{id}")
	public void deleteSector(@PathVariable Long id) {
		sectorService.deleteSectorById(id);
	}
	
	

}
