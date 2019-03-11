package com.bookup.entity.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Block implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String iduser;
	
	@NotEmpty
	private Date start_date;
	
	@NotEmpty
	private Date end_date;
	
	public String getIduser() {
		return iduser;
	}
	public void setIduser(String iduser) {
		this.iduser = iduser;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public Block(@NotEmpty String iduser, @NotEmpty Date start_date, @NotEmpty Date end_date) {
		super();
		this.iduser = iduser;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public Block() {
		
	}
	
	
}
