package com.martins.check.service;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CheckService {

	@Autowired
    RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "callPersonServiceFallBack")
	    public String checkPersonScore(String groupname) {
	 
		 System.out.println("Getting Person details for " + groupname);

	        String response = restTemplate
	                .exchange("http://localhost:8080/getPersonDetailsForGroup/{groupname}"
	                , HttpMethod.GET
	                , null
	                , new ParameterizedTypeReference<String>() {
	            }, groupname).getBody();
	 
	        System.out.println("Response Received as " + response + " -  " + new Date());
	 
	        return "NORMAL FLOW !!! - Group Name -  " + groupname + " :::  " + " Person Details " + response + " -  " + new Date();
	    }
	 
	 
	 private String callPersonServiceFallBack(String groupname) {
		 
	        System.out.println("Person Service is down!!! fallback route enabled...");

	        return "CIRCUIT BREAKER ENABLED!!! No Response From Person Service at this moment. " + " Service will be back shortly  - " + new Date();
	    }
	 
	   @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	 
}
