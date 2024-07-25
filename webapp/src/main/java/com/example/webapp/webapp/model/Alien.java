package com.example.webapp.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {

	private String aname;
	@Id
	private int aid;
	
	private String tech;
	
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + ", tech=" + tech + "]";
	}
	
	
	
}
