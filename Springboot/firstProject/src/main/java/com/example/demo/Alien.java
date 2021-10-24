package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	private int aid;
	private String aname;
	private String tech;
	
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;
	
	//------------------------METHODS----------------------------
	
	//Laptop
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	//Aid
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	//Aname	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	//Tech
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	//Show function
	public void show() {
		System.out.println("In Alien");
		laptop.compile();
	}

}
