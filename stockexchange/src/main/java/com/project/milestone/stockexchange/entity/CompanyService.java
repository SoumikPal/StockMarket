package com.project.milestone.stockexchange.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	
	public List<Company> getAllCompany(){
		List<Company> companies =new ArrayList<>();
		companyRepository.findAll().forEach(companies::add);
		return companies;
	}
	
	public void addCompany(Company company) {
		companyRepository.save(company);
	}
	
	public Optional<Company> getCompany(Long id) {
		return companyRepository.findById(id);
	}
	
	public void deleteCompany(Long id) {
		companyRepository.deleteById(id);
	}

}
