package com.bookup.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Users implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String iduser;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String last_name;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
	@NotNull
	private int phone_number;
	
	@NotEmpty
	private String role;
	
	@NotEmpty
	private String dicipline;
	
	
	public String getIduser() {
		return iduser;
	}
	public void setIduser(String iduser) {
		this.iduser = iduser;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDicipline() {
		return dicipline;
	}
	public void setDicipline(String dicipline) {
		this.dicipline = dicipline;
	}
	
	public Users(String iduser, @NotEmpty String name, @NotEmpty String last_name, @NotEmpty String email,
			@NotNull int phone_number, @NotEmpty String role, @NotEmpty String dicipline) {
		super();
		this.iduser = iduser;
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
		this.role = role;
		this.dicipline = dicipline;
	}
	
	public Users() {

	}
	
	
}
