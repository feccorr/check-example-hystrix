package com.martins.check.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.martins.check.service.CheckService;

@RestController
public class CheckServiceController {

	@Autowired
	CheckService checkService;
	
	 @RequestMapping(value = "/getPersonScoreByGroup/{groupname}", method = RequestMethod.GET)
	    public String getStudents(@PathVariable String groupname) {
	        System.out.println("Going to call check service to get data!");
	        return checkService.checkPersonScore(groupname);
	    }
	
}
