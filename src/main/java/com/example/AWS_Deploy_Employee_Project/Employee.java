package com.example.AWS_Deploy_Employee_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	  private String name;
	    private String role;
	    public Employee() {
	    	
	    }
	    
	  @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	
	  public Employee(Long id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
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
	  public String getRole() {
		  return role;
	  }
	  public void setRole(String role) {
		  this.role = role;
	  }		
}

