package com.hcl.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Loan {
	
	private Long id;
	private String name;
	private String passportNumber;
	
	 public Loan() {
		    super();
		  }
	 
	 public Loan(Long id, String name, String passportNumber) {
		    super();
		    this.id = id;
		    this.name = name;
		    this.passportNumber = passportNumber;
		  }
		  public Long getId() {
		    return id;
		  }
		  public void setId(Long id) {
		    this.id = id;
		  }
		  public String getName() {
		    return name;
		  }
		  public void setName(String name) {
		    this.name = name;
		  }
		  public String getPassportNumber() {
		    return passportNumber;
		  }
		  public void setPassportNumber(String passportNumber) {
		    this.passportNumber = passportNumber;
		  }
	

}
