package com.example.webapp.webapp.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.webapp.webapp.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer> {

	List<Alien>findByTech(String tech);
	
	
}
