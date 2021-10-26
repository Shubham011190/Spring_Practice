package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.alienDao;
import com.example.demo.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	alienDao aliend;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		aliend.save(alien);
		return "home.jsp";
	}
	
//	@RequestMapping("/getAlien")
//		public ModelAndView getAlien(@RequestParam int aid) {
//		ModelAndView mv = new ModelAndView("getAlien.jsp");
//		Alien alien = aliend.findById(aid).orElse(new Alien());
//		mv.addObject(alien);
//		
//		System.out.println(aliend.findByTech("Java"));
//		System.out.println(aliend.findByAidGreaterThan(102));
//		System.out.println(aliend.findByTechSortedName("Java"));
//		return mv;
//		}
	
	@RequestMapping("/aliens")
	@ResponseBody
	public String getAliens() {
		
		return aliend.findAll().toString();
	}
	
	
	@RequestMapping("/aliens/{aid}")
	@ResponseBody
	public String getAlien(@PathVariable("aid") int aid) {
		
		return aliend.findById(aid).toString();
	}
}











