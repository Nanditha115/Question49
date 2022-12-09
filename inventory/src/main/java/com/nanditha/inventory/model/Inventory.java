package com.nanditha.inventory.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Inventory {

    private long id;
    private String name;
    private String availability;
    
    public Inventory() {
   	}

	public Inventory(long id, String name, String availability) {
		super();
		this.id = id;
		this.name = name;
		this.availability = availability;
	}

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}
    
}

    
   
	
