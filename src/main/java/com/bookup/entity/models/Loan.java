package com.bookup.entity.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Loan implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@NotNull
	private String iduser;
	
	@NotNull
	private int isbn;
	
	@NotNull
	private Date loan_date;
	
	@NotNull
	private Date return_date;

	
	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Date getLoan_date() {
		return loan_date;
	}

	public void setLoan_date(Date loan_date) {
		this.loan_date = loan_date;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public Loan(@NotNull String iduser, @NotNull int isbn, @NotNull Date loan_date, @NotNull Date return_date) {
		super();
		this.iduser = iduser;
		this.isbn = isbn;
		this.loan_date = loan_date;
		this.return_date = return_date;
	}

	public Loan() {
		
	}
	
	
	
}
