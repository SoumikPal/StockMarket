package com.project.milestone.stockexchange.boarddirector;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyBoardOfDirectorsService {
	@Autowired
	private CompanyBoardOfDirectorsRepository companyBoardRepository;
	
	
	
	public void addCompanyBoard(CompanyBoardOfDirectors company) {
		companyBoardRepository.save(company);
	}
	
	public Optional<CompanyBoardOfDirectors> getCompanyBoard(Long id) {
		return companyBoardRepository.findById(id);
	}
	
	public void deleteCompanyBoard(Long id) {
		companyBoardRepository.deleteById(id);
	}

}
