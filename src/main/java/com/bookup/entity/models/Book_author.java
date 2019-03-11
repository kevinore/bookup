package com.bookup.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Book_author implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty 
	private int isbn;
	
	@NotNull
	private long id_author;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public long getId_author() {
		return id_author;
	}
	public void setId_author(long id_author) {
		this.id_author = id_author;
	}
	public Book_author(@NotEmpty int isbn, @NotNull long id_author) {
		super();
		this.isbn = isbn;
		this.id_author = id_author;
	}
	public Book_author() {
		
	}
}
