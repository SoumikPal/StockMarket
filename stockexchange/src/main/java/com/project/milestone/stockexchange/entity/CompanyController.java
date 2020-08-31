package com.project.milestone.stockexchange.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@Autowired
	private CompanyService companyService;

	@RequestMapping("/company")
	public List<Company> getresult() {
		return companyService.getAllCompany();
	}

	@RequestMapping("/company/{name}")
	public Optional<Company> getTopic(@PathVariable Long name) {
		return companyService.getCompany(name);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/company")
	public void addTopic(@RequestBody Company company) {
		companyService.addCompany(company);

	}
	
	public void deleteCompany(@PathVariable Long id) {
		companyService.deleteCompany(id);
	}

}
