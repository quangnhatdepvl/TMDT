package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "rate")
public class Rate implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 856228268484022312L;
	@Id
	@Column(name = "idRate", length = 250)
	private	String idRate;
	@Column(name = "numStar")
	private int numStar;
	@Column(name = "content")
	private String content;
	public Rate(String idRate, int numStar, String content) {
		super();
		this.idRate = idRate;
		this.numStar = numStar;
		this.content = content;
	}
	public String getIdRate() {
		return idRate;
	}
	public void setIdRate(String idRate) {
		this.idRate = idRate;
	}
	public int getNumStar() {
		return numStar;
	}
	public void setNumStar(int numStar) {
		this.numStar = numStar;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Rate [idRate=" + idRate + ", numStar=" + numStar + ", content=" + content + "]";
	}
	

}
