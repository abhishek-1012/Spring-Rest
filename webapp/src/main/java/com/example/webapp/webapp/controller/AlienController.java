package com.example.webapp.webapp.controller;


import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.webapp.webapp.Repository.AlienRepo;

import com.example.webapp.webapp.model.Alien;

@RestController
public class AlienController {

	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@Autowired
	AlienRepo ar;
	
	
	@RequestMapping("/addAlien")
	public String AddAlien(@RequestBody Alien al) {
		ar.save(al);
		return "Added successfully";
	}
	
	@RequestMapping("/getAlien/{id}")
	public String getAlien(@PathVariable int id) {
		
		//ModelAndView mv=new ModelAndView("ShowAlien.jsp");
		
		Alien ret= ar.findById(id).orElse(new Alien());
		return ret.getAname();
	}
	
	@RequestMapping("/getall")
	public List<Alien> getallaliends(){
		return (List<Alien>) ar.findAll();
	}
	
	
	@RequestMapping("Getallnames/{tech}")
	public ArrayList<String> findbytech(@PathVariable String tech){
		ArrayList<Alien>all=(ArrayList<Alien>) ar.findByTech(tech);
		
ArrayList<String>result=new ArrayList<>();
		
		for (int i=0;i<all.size();i++) {
			if(all.get(i).getTech().equals(tech)) {
				result.add(all.get(i).getAname());
			}
		}
	return result;
	}
	
	
	
	
}
