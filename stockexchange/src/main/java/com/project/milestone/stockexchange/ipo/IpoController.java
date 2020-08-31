package com.project.milestone.stockexchange.ipo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IpoController {
	@Autowired
	private IpoService companyService;

	@RequestMapping("/ipo")
	public List<Ipo> getAllIpo() {
		return companyService.getAllIpo();
	}

	@RequestMapping("/ipo/{id}")
	public List<Ipo> getTopic(@PathVariable Long id) {
		return companyService.getCompany(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/ipo")
	public void addTopic(@RequestBody Ipo company) {
		companyService.addCompany(company);

	}
	
	public void deleteCompany(@PathVariable Long id) {
		companyService.deleteCompany(id);
	}

}
