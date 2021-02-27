package com.project.petclinic.dao.mem;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.petclinic.dao.PetRepository;
import com.project.petclinic.model.Owner;
import com.project.petclinic.model.Pet;

@Repository
public class PetRepositoryImpl implements PetRepository {

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pet> findByOwnerId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Pet pet) {
		// TODO Auto-generated method stub

	}

	@Override
	public Owner update(Pet pet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByOwnerId(Long ownerId) {
		// TODO Auto-generated method stub

	}

}
