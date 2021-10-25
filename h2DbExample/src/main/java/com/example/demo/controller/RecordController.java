package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.RecordDao;
import com.example.demo.model.Record;

@Controller
public class RecordController {
	
	@Autowired
	RecordDao rd;
	
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addRecord")
	public String addRecord(Record record) {
		
		rd.save(record);
		return "home.jsp";
	}
}
