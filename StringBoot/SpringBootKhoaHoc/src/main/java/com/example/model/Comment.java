package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="comment")
public class Comment  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1819432078324095925L;
	@Id
	@Column(name = "idCommnent", length = 250)
	private String idCommnent;
	@Column(name ="content")
	private String content;
	public Comment(String idCommnent, String content) {
		super();
		this.idCommnent = idCommnent;
		this.content = content;
	}
	public String getIdCommnent() {
		return idCommnent;
	}
	public void setIdCommnent(String idCommnent) {
		this.idCommnent = idCommnent;
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
		return "Comment [idCommnent=" + idCommnent + ", content=" + content + "]";
	}
	

}
