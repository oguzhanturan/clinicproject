package com.project.petclinic.service;

import java.util.List;

import com.project.petclinic.exception.OwnerNotFoundException;
import com.project.petclinic.model.Owner;

public interface PetClinicService {
	
	List<Owner> findOwners();
	List<Owner> findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
	void CreateOwner(Owner owner);
	void UpdateOwner(Owner owner);
	void DeleteOwner(Long id);
}
