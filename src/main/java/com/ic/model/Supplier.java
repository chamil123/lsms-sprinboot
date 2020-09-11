package com.ic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "suppliers")
public class Supplier {
	
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="sup_id",nullable = false)
	private long id;

	@NotNull
	@Column(name="sup_full_name",nullable = false)
	private String supfullname;
	
	@NotNull
	@Column(name="sup_office_number",nullable = false)
	private String supofficenumber;
	
	@NotNull
	@Column(name="sup_mobile_number",nullable = false)
	private String supmobilenumber;
	
	@NotNull
	@Column(name="sup_email",nullable = false)
	private String supemail;
	
	@Column(name="sup_address")
	private String supaddress;
	
	@Column(name="sup_remark")
	private String supremark;
	
	@Column(name="sup_created_date")
	private String supcreateddate;
	
	@Column(name="sup_status")
	private int supstatus;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSupfullname() {
		return supfullname;
	}

	public void setSupfullname(String supfullname) {
		this.supfullname = supfullname;
	}

	public String getSupofficenumber() {
		return supofficenumber;
	}

	public void setSupofficenumber(String supofficenumber) {
		this.supofficenumber = supofficenumber;
	}

	public String getSupmobilenumber() {
		return supmobilenumber;
	}

	public void setSupmobilenumber(String supmobilenumber) {
		this.supmobilenumber = supmobilenumber;
	}

	public String getSupemail() {
		return supemail;
	}

	public void setSupemail(String supemail) {
		this.supemail = supemail;
	}

	public String getSupaddress() {
		return supaddress;
	}

	public void setSupaddress(String supaddress) {
		this.supaddress = supaddress;
	}

	public String getSupremark() {
		return supremark;
	}

	public void setSupremark(String supremark) {
		this.supremark = supremark;
	}

	public String getSupcreateddate() {
		return supcreateddate;
	}

	public void setSupcreateddate(String supcreateddate) {
		this.supcreateddate = supcreateddate;
	}

	public int getSupstatus() {
		return supstatus;
	}

	public void setSupstatus(int supstatus) {
		this.supstatus = supstatus;
	}
	

	

}
