package com.project.petclinic.model;

import java.util.Set;

public class Owner {
	
	private Long id;
	private String firtName;
	private String lastName;
	private Set<Pet> pets;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<Pet> getPets() {
		return pets;
	}
	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
	
	
}
