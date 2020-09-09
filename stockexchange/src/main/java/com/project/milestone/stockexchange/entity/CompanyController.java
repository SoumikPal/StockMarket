package com.project.milestone.stockexchange.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/company")
	public List<Company> getresult() {
		return companyService.getAllCompany();
	}
	
	
	@RequestMapping("/company/{name}")
	public Optional<Company> getTopic(@PathVariable Long name) {
		return companyService.getCompany(name);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.POST, value = "/company")
	public void addTopic(@RequestBody Company company) {
		companyService.addCompany(company);

	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/company")
	public void updateCompany(@RequestBody Company company) {
		companyService.addCompany(company);

	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.DELETE, value = "/company/{id}")
	public void deleteCompany(@PathVariable Long id) {
		companyService.deleteCompany(id);
	}
    
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.GET, value = "/company/{id}")
	public Optional<Company> getCompanyById(@PathVariable Long id) {
		
		return companyService.getCompany(id);
		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.GET, value = "/company/sector/{name}")
	public List<Company> getCompaniesInSector(@PathVariable String name){
		return companyService.getCompaniesInSector(name);
		
	}

}
