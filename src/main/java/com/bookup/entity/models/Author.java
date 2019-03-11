package com.bookup.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Author implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotNull
	private long id_author;
	
	@NotNull
	private String name;
	
	@NotNull
	private String last_name;

	public long getId_author() {
		return id_author;
	}

	public void setId_author(long id_author) {
		this.id_author = id_author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Author(@NotNull long id_author, @NotNull String name, @NotNull String last_name) {
		super();
		this.id_author = id_author;
		this.name = name;
		this.last_name = last_name;
	}

	public Author() {
		
	}
	
	
	
}
