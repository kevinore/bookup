package com.bookup.entity.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
public class Book implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String isbn;
	
	@NotEmpty 
	private String title;
	
	@NotEmpty 
	private String editorial;
	
	@NotEmpty 
	private String edition;
	
	@NotEmpty 
	private String abstract_book;
	
	@NotNull
	private Date releas_data;
	
	@NotNull
	private int ammount;
	
	@NotEmpty
	private String location;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getAbstract_book() {
		return abstract_book;
	}
	public void setAbstrat(String abstract_book) {
		this.abstract_book = abstract_book;
	}
	public Date getReleas_data() {
		return releas_data;
	}
	public void setReleas_data(Date releas_data) {
		this.releas_data = releas_data;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
