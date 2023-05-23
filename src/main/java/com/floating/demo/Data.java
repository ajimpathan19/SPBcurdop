package com.floating.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Data {
	
	private long id;
	private String name;
	private Integer clas;
	private Integer rollno;
	private float percent;
	
	
	public Data() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getClas() {
		return clas;
	}
	public void setClas(Integer clas) {
		this.clas = clas;
	}
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	
	

}
