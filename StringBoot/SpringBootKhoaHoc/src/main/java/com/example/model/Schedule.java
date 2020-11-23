package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "schedule")
public class Schedule implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4305371926079559981L;
	@Id
	@Column(name = "idSchedule", length = 250)
	private String idSchedule;
	@Column(name = "position")
	private String position;
	@Column(name = "daysOfWeek")
	private String daysOfWeek;
	public Schedule(String idSchedule, String position, String daysOfWeek) {
		super();
		this.idSchedule = idSchedule;
		this.position = position;
		this.daysOfWeek = daysOfWeek;
	}
	public String getIdSchedule() {
		return idSchedule;
	}
	public void setIdSchedule(String idSchedule) {
		this.idSchedule = idSchedule;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDaysOfWeek() {
		return daysOfWeek;
	}
	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Schedule [idSchedule=" + idSchedule + ", position=" + position + ", daysOfWeek=" + daysOfWeek + "]";
	}
	
	
	
	

}
