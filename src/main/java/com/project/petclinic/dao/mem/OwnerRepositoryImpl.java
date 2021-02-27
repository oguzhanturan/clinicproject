package com.project.petclinic.dao.mem;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.petclinic.dao.OwnerRepository;
import com.project.petclinic.model.Owner;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

	public OwnerRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Owner> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Owner> findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Owner owner) {
		// TODO Auto-generated method stub

	}

	@Override
	public Owner update(Owner owner) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
