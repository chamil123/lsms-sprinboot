package com.ic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;


public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id",nullable = false)
	private int userid;
	
	@NotNull
	@Column(name="user_full_name",nullable = false)
	private String userfullname;
	
	@NotNull
	@Column(name="user_email",nullable = false)
	private String useremail;
	
	@Column(name="user_image")
	private String userimage;
	
	@NotNull
	@Column(name="user_contact_number",nullable = false)
	private String usercontactnumber;
	
	@NotNull
	@Column(name="user_gender",nullable = false)
	private String usergender;
	
	@NotNull
	@Column(name="user_dob",nullable = false)
	private String userdob;
	
	@NotNull
	@Column(name="user_nic",nullable = false)
	private String usernic;
	
	@Column(name="user_address")
	private String useraddress;
	
	@NotNull
	@Column(name="username",nullable = false)
	private String user_uname;
	
	@Column(name="role_id")
	@OneToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	@Column(name="status")
	private int user_status;
	
	@Column(name ="user_joined_date")
	private String userjoineddate;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserfullname() {
		return userfullname;
	}

	public void setUserfullname(String userfullname) {
		this.userfullname = userfullname;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserimage() {
		return userimage;
	}

	public void setUserimage(String userimage) {
		this.userimage = userimage;
	}

	public String getUsercontactnumber() {
		return usercontactnumber;
	}

	public void setUsercontactnumber(String usercontactnumber) {
		this.usercontactnumber = usercontactnumber;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getUserdob() {
		return userdob;
	}

	public void setUserdob(String userdob) {
		this.userdob = userdob;
	}

	public String getUsernic() {
		return usernic;
	}

	public void setUsernic(String usernic) {
		this.usernic = usernic;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUser_uname() {
		return user_uname;
	}

	public void setUser_uname(String user_uname) {
		this.user_uname = user_uname;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getUser_status() {
		return user_status;
	}

	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}

	public String getUserjoineddate() {
		return userjoineddate;
	}

	public void setUserjoineddate(String userjoineddate) {
		this.userjoineddate = userjoineddate;
	}
	
	

}
