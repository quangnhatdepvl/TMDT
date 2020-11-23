package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "user")
public class User implements Serializable{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 3868269731826822792L;
	@Id
	@Column(name = "idUser", length = 250)
	private String idUser;
	@Column(name = "userName")
	private String userName;
	@Column(name = "password")
	private String password;
	@Column(name = "level")
	private int level;
	@Column(name = "status")
	private String status;
	public User(String idUser, String userName, String password, int level, String status) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.level = level;
		this.status = status;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", password=" + password + ", level=" + level
				+ ", status=" + status + "]";
	}
	

}
