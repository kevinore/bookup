package com.bookup.entity.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Comment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idcomment;
	
	@NotNull
	private Date date;
	
	@NotEmpty
	private String description;
	
	@NotNull
	private int evaluation;

	public long getIdcomment() {
		return idcomment;
	}

	public void setId_comment(long id_comment) {
		this.idcomment = id_comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(int evaluation) {
		this.evaluation = evaluation;
	}

	public Comment(@NotNull Date date, @NotEmpty String description, @NotNull int evaluation) {
		super();
		this.date = date;
		this.description = description;
		this.evaluation = evaluation;
	}

	public Comment() {
		
	}
}
