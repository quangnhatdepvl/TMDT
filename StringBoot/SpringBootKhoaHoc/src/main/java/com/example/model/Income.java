package com.example.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "income")
public class Income implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6971449344215468897L;
	@Id
	@Column(name = "idIncome", length = 250)
	private String 	idIncome;
	@Column(name = "date")
	private Timestamp date;
	@Column(name = "totalCost")
	private int totalCost;
	public Income(String idIncome, Timestamp date, int totalCost) {
		super();
		this.idIncome = idIncome;
		this.date = date;
		this.totalCost = totalCost;
	}
	public String getIdIncome() {
		return idIncome;
	}
	public void setIdIncome(String idIncome) {
		this.idIncome = idIncome;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Income [idIncome=" + idIncome + ", date=" + date + ", totalCost=" + totalCost + "]";
	}
	

}
