package com.ic.model;

//import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cus_id",nullable = false)
	private long id;
	
	@NotNull
	@Column(name = "cus_full_name",nullable = false)
	private String cusfullname;
	
	@NotNull
	@Column(name = "cus_NIC_number",nullable = false)
	private String cusNicNumber;
	
	@Column(name = "cus_age")
	private int cusage;
	
	@NotNull
	@Column(name = "cusdob",nullable = false)
	private String cusdob;
	

	@Column(name = "cus_status",nullable = false)
	private int cusstatus;
	
	@NotNull
	@Column(name = "cus_email",nullable = false)
	private String cusemail;
	
	
	@Column(name = "cus_address",nullable = false)
	private String cusaddress;
	
	@NotNull
	@Column(name = "cus_contact_number",nullable = false)
	private String cuscontactnumber;
	
	@Column(name = "created_at")
	private String createdat;
	
	@Column(name = "updated_at")
	private String updatedat;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCusfullname() {
		return cusfullname;
	}

	public void setCusfullname(String cusfullname) {
		this.cusfullname = cusfullname;
	}

	public String getCusNicNumber() {
		return cusNicNumber;
	}

	public void setCusNicNumber(String cusNicNumber) {
		this.cusNicNumber = cusNicNumber;
	}

	public int getCusage() {
		return cusage;
	}

	public void setCusage(int cusage) {
		this.cusage = cusage;
	}

	public String getCusdob() {
		return cusdob;
	}

	public void setCusdob(String cusdob) {
		this.cusdob = cusdob;
	}

	public int getCusstatus() {
		return cusstatus;
	}

	public void setCusstatus(int cusstatus) {
		this.cusstatus = cusstatus;
	}

	public String getCusemail() {
		return cusemail;
	}

	public void setCusemail(String cusemail) {
		this.cusemail = cusemail;
	}

	public String getCusaddress() {
		return cusaddress;
	}

	public void setCusaddress(String cusaddress) {
		this.cusaddress = cusaddress;
	}

	public String getCuscontactnumber() {
		return cuscontactnumber;
	}

	public void setCuscontactnumber(String cuscontactnumber) {
		this.cuscontactnumber = cuscontactnumber;
	}

	public String getCreatedat() {
		return createdat;
	}

	public void setCreatedat(String createdat) {
		this.createdat = createdat;
	}

	public String getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(String updatedat) {
		this.updatedat = updatedat;
	}

	
	
	
}
