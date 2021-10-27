package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.alienDao;
import com.example.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	alienDao aliend;
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}

	
	@GetMapping("/addAlien")
	public String addAlien(Alien alien) {
		aliend.save(alien);
		return "home.jsp";
	}
	
	@PostMapping( path="/aliens", consumes= {"application/json"})		//'consumes' allows us to decide what kind of data the function accepts, 'produces' decides what kind of data is produced
	public Alien postAlien(Alien alien) {
		aliend.save(alien);
		return alien;
	}
	
	@DeleteMapping("/aliens/{aid}")
	public String deleteAlien(@PathVariable int aid) {
		Alien a = aliend.getOne(aid);
		aliend.delete(a);
		return "The alien has been vaporized!";
	}
	
	@PutMapping("/aliens")
	public Alien saveOrUpdate(Alien alien) {
		aliend.save(alien);
		return alien;
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
	
	@GetMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		
		return aliend.findAll();
	}
	
	
	@GetMapping("/aliens/{aid}")
//	@ResponseBody															We don't need ResponseBody because we have declared the class as RestController, instead of Controller.
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		
		return aliend.findById(aid);
	}
}











