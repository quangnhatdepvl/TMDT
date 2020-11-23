package com.example.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "shift")
public class Shift  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5947742219402324370L;
	@Id
	@Column(name = "idShift", length = 250)
	private String idShift;
	@Column(name = "nameShift")
	private String nameShift;
	@Column(name = "startTime")
	private Date startTime;
	@Column(name = "endTime")
	private Date endTime;
	public Shift(String idShift, String nameShift, Date startTime, Date endTime) {
		super();
		this.idShift = idShift;
		this.nameShift = nameShift;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getIdShift() {
		return idShift;
	}
	public void setIdShift(String idShift) {
		this.idShift = idShift;
	}
	public String getNameShift() {
		return nameShift;
	}
	public void setNameShift(String nameShift) {
		this.nameShift = nameShift;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Shift [idShift=" + idShift + ", nameShift=" + nameShift + ", startTime=" + startTime + ", endTime="
				+ endTime + "]";
	}
	
	

}
