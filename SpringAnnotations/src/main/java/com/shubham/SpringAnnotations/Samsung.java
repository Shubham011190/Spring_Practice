package com.shubham.SpringAnnotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	
	@Autowired
	Processor c;
	public Processor getC() {
		return c;
	}
	public void setC(Processor c) {
		this.c = c;
	}
	public void config() {
		System.out.println("Octa Core, RAM, etc etc");
		c.process();
	}
}
