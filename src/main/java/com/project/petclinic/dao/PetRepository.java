package com.project.petclinic.dao;

import java.util.List;

import com.project.petclinic.model.Owner;
import com.project.petclinic.model.Pet;

public interface PetRepository {
	
	Pet findById(Long id);
	List<Pet> findByOwnerId(Long id);
	void create(Pet pet);
	Owner update(Pet pet);
	void delete(Long id);
	void deleteByOwnerId(Long ownerId); 
}
