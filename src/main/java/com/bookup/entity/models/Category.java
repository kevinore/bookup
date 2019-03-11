package com.bookup.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_category;
	
	@NotEmpty
	private String category;

	public long getId_category() {
		return id_category;
	}

	public void setId_category(long id_category) {
		this.id_category = id_category;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Category(long id_category, @NotEmpty String category) {
		super();
		this.id_category = id_category;
		this.category = category;
	}

	public Category() {
		
	}

}
