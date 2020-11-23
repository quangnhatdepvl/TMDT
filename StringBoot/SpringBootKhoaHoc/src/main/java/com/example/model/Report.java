package com.example.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "report")
public class Report implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -439709969517447265L;
	@Id
	@Column(name = "idReport", length = 250)
	private String idReport;
	@Column(name = "dateReport")
	private Timestamp dateReport;
	@Column(name = "content")
	private String content;
	@Column(name = "link")
	private String link;
	@Column(name = "money")
	private int money;
	public Report(String idReport, Timestamp dateReport, String content, String link, int money) {
		super();
		this.idReport = idReport;
		this.dateReport = dateReport;
		this.content = content;
		this.link = link;
		this.money = money;
	}
	public String getIdReport() {
		return idReport;
	}
	public void setIdReport(String idReport) {
		this.idReport = idReport;
	}
	public Timestamp getDateReport() {
		return dateReport;
	}
	public void setDateReport(Timestamp dateReport) {
		this.dateReport = dateReport;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Report [idReport=" + idReport + ", dateReport=" + dateReport + ", content=" + content + ", link=" + link
				+ ", money=" + money + "]";
	}
	
	

}
