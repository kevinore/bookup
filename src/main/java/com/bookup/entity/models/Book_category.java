package com.bookup.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Book_category implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private int isbn;
	
	@NotNull
	private long category;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public long getCategory() {
		return category;
	}

	public void setCategory(long category) {
		this.category = category;
	}

	public Book_category(@NotEmpty int isbn, @NotNull long category) {
		super();
		this.isbn = isbn;
		this.category = category;
	}

	public Book_category() {
		
	}
}
