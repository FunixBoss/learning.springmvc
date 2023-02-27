package com.learning.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.learning.entity.Pet;

public class IOService {

	private List<Pet> pets;

	public IOService() {
		super();
	}

	public IOService(List<Pet> pets) {
		super();
		this.pets = pets;
	}

	public void savePet(List<Pet> pets) {
		this.pets.addAll(pets);
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

}