package com.martins.score.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.martins.score.domain.Person;

@RestController
public class PersonScoreController {
	
	 private static Map<String, List<Person>> personDB = new HashMap<String, List<Person>>();
	 
	    static {
	    	personDB = new HashMap<String, List<Person>>();
	 
	        List<Person> lst = new ArrayList<Person>();
	        Person std = new Person("Salim", "3.0");
	        lst.add(std);
	        std = new Person("Half", "4.0");
	        lst.add(std);
	        std = new Person("Gordon", "3.2");
	        lst.add(std);
	 
	       personDB.put("PJ", lst);
	 
	        lst = new ArrayList<Person>();
	        std = new Person("Jonh", "4.5");
	        lst.add(std);
	        std = new Person("Connor", "2.1");
	        lst.add(std);
	        std = new Person("Arnold", "4.8");
	        lst.add(std);
	 
	      personDB.put("PF", lst);
	 
	    }
	 
	    @GetMapping("/getPersonDetailsForGroup/{groupname}")
	    public List<Person> getPersons(@PathVariable String groupname) {
	        System.out.println("Getting Person details for " + groupname);
	 
	        List<Person> personList = personDB.get(groupname);
	        if (personList == null) {
	            personList = new ArrayList<Person>();
	            Person std = new Person("Not Found", "N/A");
	            personList.add(std);
	        }
	        return personList;
	    }

}
