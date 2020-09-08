package com.project.milestone.stockexchange.boarddirector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyBoardOfDirectorsController {
	@Autowired
	private CompanyBoardOfDirectorsService companyService;

	
	@RequestMapping("/company/{id}/board")
	public Optional<CompanyBoardOfDirectors> getTopic(@PathVariable Long id) {
		return companyService.getCompanyBoard(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/company/{id}/board")
	public void addTopic(@RequestBody CompanyBoardOfDirectors company) {
		companyService.addCompanyBoard(company);

	}
	@RequestMapping(method=RequestMethod.DELETE,value="/company/{id}/board")
	public void deleteCompany(@PathVariable Long id) {
		companyService.deleteCompanyBoard(id);
	}

}
