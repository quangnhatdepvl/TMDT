package com.example.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "payment")
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8875304181036315262L;
	@Id
	@Column(name = "idPayment", length = 250)
	
	private String idPayment;
	@Column(name = "datePayment")
	private Timestamp datePayment;
	@Column(name = "cost")
	private int cost;
	public Payment(String idPayment, Timestamp datePayment, int cost) {
		super();
		this.idPayment = idPayment;
		this.datePayment = datePayment;
		this.cost = cost;
	}
	public String getIdPayment() {
		return idPayment;
	}
	public void setIdPayment(String idPayment) {
		this.idPayment = idPayment;
	}
	public Timestamp getDatePayment() {
		return datePayment;
	}
	public void setDatePayment(Timestamp datePayment) {
		this.datePayment = datePayment;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Payment [idPayment=" + idPayment + ", datePayment=" + datePayment + ", cost=" + cost + "]";
	}
	
	

}
