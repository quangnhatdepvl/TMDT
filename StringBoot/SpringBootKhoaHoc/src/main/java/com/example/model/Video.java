package com.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "video")

public class Video implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3527146744171395437L;
	
	@Id
	@Column(name = "idVideo", length = 250)
	private String idVideo;
	@Column(name = "nameVideo")
	private String nameVideo;
	@Column(name = "link")
	private String link;
	public Video(String idVideo, String nameVideo, String link) {
		super();
		this.idVideo = idVideo;
		this.nameVideo = nameVideo;
		this.link = link;
	}
	public String getIdVideo() {
		return idVideo;
	}
	public void setIdVideo(String idVideo) {
		this.idVideo = idVideo;
	}
	public String getNameVideo() {
		return nameVideo;
	}
	public void setNameVideo(String nameVideo) {
		this.nameVideo = nameVideo;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Video [idVideo=" + idVideo + ", nameVideo=" + nameVideo + ", link=" + link + "]";
	}
	
	

}
