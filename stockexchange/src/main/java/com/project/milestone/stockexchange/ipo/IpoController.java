package com.project.milestone.stockexchange.ipo;

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
public class IpoController {
	@Autowired
	private IpoService companyService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/ipo")
	public List<Ipo> getAllIpo() {
		return companyService.getAllIpo();
	}

	@RequestMapping("/ipo/{id}")
	public List<Ipo> getIpoForCompany(@PathVariable Long id) {
		return companyService.getCompany(id);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.POST, value = "/ipo")
	public void addIpo(@RequestBody Ipo ipo) {
		companyService.addCompany(ipo);

	}
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method = RequestMethod.DELETE, value = "/ipo/{id}")
	public void deleteCompany(@PathVariable Long id) {
		companyService.deleteCompany(id);
	}

}
