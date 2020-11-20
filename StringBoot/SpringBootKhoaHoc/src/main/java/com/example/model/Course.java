package com.example.model;

public class Course {
	private String idCourse;
	private String nameCourse;
	private String type;
	private int cost;
	private String cotent;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(String idCourse, String nameCourse, String type, int cost, String cotent) {
		super();
		this.idCourse = idCourse;
		this.nameCourse = nameCourse;
		this.type = type;
		this.cost = cost;
		this.cotent = cotent;
	}
	public String getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(String idCourse) {
		this.idCourse = idCourse;
	}
	public String getNameCourse() {
		return nameCourse;
	}
	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCotent() {
		return cotent;
	}
	public void setCotent(String cotent) {
		this.cotent = cotent;
	}
	
	
}
