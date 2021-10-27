package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.model.Alien;

public interface alienDao extends JpaRepository<Alien, Integer>{
	List<Alien> findByTech(String tech);		//Autoconfigured by Spring. Use findBy[field_name]

	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSortedName(String tech);
}
