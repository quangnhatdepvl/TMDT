package com.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "userinfo")
public class userinfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 279800516598888572L;
	@Id
	@Column(name = "idUserInfo", length = 250)
	private String idUserInfo;
	@Column(name = "fullName")
	private String fullName;
	@Column(name = "date")
	private Date date;
	@Column(name = "sex")
	private String sex;
	@Column(name = "avatar")
	private String avatar;
	@Column(name = "identify")
	private int identify;
	public userinfo(String idUserInfo, String fullName, Date date, String sex, String avatar, int identify) {
		super();
		this.idUserInfo = idUserInfo;
		this.fullName = fullName;
		this.date = date;
		this.sex = sex;
		this.avatar = avatar;
		this.identify = identify;
	}
	public String getIdUserInfo() {
		return idUserInfo;
	}
	public void setIdUserInfo(String idUserInfo) {
		this.idUserInfo = idUserInfo;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public int getIdentify() {
		return identify;
	}
	public void setIdentify(int identify) {
		this.identify = identify;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "userinfo [idUserInfo=" + idUserInfo + ", fullName=" + fullName + ", date=" + date + ", sex=" + sex
				+ ", avatar=" + avatar + ", identify=" + identify + "]";
	}
	
	
	

}
