package com.project.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.petclinic.dao.OwnerRepository;
import com.project.petclinic.exception.OwnerNotFoundException;
import com.project.petclinic.model.Owner;

@Service
public class PetClinicServiceImpl implements PetClinicService {
	
	OwnerRepository ownerRepository;
	
	@Autowired
	public void setOwnerRepository(OwnerRepository ownerRepository) {
		this.ownerRepository = ownerRepository;
	}
	
	@Override
	public List<Owner> findOwners() {
		// TODO Auto-generated method stub
		return ownerRepository.findAll();
	}

	@Override
	public List<Owner> findOwners(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepository.findByLastName(lastName);
	}

	@Override
	public Owner findOwner(Long id) throws OwnerNotFoundException {
		// TODO Auto-generated method stub
		Owner owner = ownerRepository.findById(id);
		if(owner != null )
			return owner;
		else {
			throw new OwnerNotFoundException("Owner not found with id :"+ id);
		}
	}

	@Override
	public void CreateOwner(Owner owner) {
		ownerRepository.create(owner);
	}

	@Override
	public void UpdateOwner(Owner owner) {
		ownerRepository.update(owner);
	}

	@Override
	public void DeleteOwner(Long id) {
		ownerRepository.delete(id);
	}

}
