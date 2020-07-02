package com.martins.score.domain;

public class Person {
	
    private String name;
    private String score;
    
    public Person(String name, String score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
    
    
}
