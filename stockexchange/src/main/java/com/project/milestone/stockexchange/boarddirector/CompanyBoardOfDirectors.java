package com.project.milestone.stockexchange.boarddirector;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyBoardOfDirectors {

	@Id
	private Long id;
	private String boardOfDirectors;

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public CompanyBoardOfDirectors() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompanyBoardOfDirectors(Long id, String boardOfDirectors) {
		super();
		this.id = id;
		this.boardOfDirectors = boardOfDirectors;
	}

}
