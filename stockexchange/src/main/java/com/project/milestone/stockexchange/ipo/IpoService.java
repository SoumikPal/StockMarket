package com.project.milestone.stockexchange.ipo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IpoService {
	@Autowired
	private IpoRepository companyRepository;
	
	public List<Ipo> getAllIpo(){
		List<Ipo> companies =new ArrayList<>();
		companyRepository.findAll().forEach(companies::add);
		return companies;
	}
	
	public void addCompany(Ipo ipo) {
		companyRepository.save(ipo);
	}
	
	public List<Ipo> getCompany(Long id) {
		return companyRepository.findByCompanyid(id);
	}
	
	public void deleteCompany(Long id) {
		companyRepository.deleteById(id);
	}

}
