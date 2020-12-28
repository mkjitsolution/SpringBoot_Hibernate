package com.mkj.test.SpringRESTHibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Instructor {
	
	@Id
	private int instructorcode;
	private String name;
	private int salary;
	private int jobstartyear;
	private String email;
	private String trainerlocation;
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getInstructorcode() {
		return instructorcode;
	}

	public void setInstructorcode(int instructorcode) {
		this.instructorcode = instructorcode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getJobstartyear() {
		return jobstartyear;
	}

	public void setJobstartyear(int jobstartyear) {
		this.jobstartyear = jobstartyear;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTrainerlocation() {
		return trainerlocation;
	}

	public void setTrainerlocation(String trainerlocation) {
		this.trainerlocation = trainerlocation;
	}
	
	
	
	

}
