package com.project.milestone.stockexchange.sector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectorController {
	@Autowired
	private SectorService sectorService;

	
	@RequestMapping("/company/{id}/sector")
	public List<Sector> getSectorOfCompany(@PathVariable Long id) {
		return sectorService.getSectorOfCompany(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/company/{id}/sector")
	public void addSectorOfCompany(@RequestBody Sector sector,@PathVariable Long id) {
		sector.setCompanyId(id);
		sectorService.addSectorOfCompany(sector);

	}
	@RequestMapping(method=RequestMethod.PUT,value="/company/{id}/sector")
	public void updateCompanySector(@RequestBody Sector sector,@PathVariable Long id) {
		sector.setCompanyId(id);
		sectorService.updateSectorOfCompany(sector);
	}
	@RequestMapping("/sector/{sectorname}")
	public List<Sector> getCompanyInSector(@PathVariable String sectorname) {
		return sectorService.getCompanyInSector(sectorname);
		
	}

}
