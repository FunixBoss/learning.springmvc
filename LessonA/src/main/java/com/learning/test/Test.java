package com.learning.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.learning.entity.Pet;
import com.learning.service.IOService;

public class Test {
	
	private IOService ioService;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("IoC.xml");

		List<Pet> pets = new ArrayList<Pet>();
		pets.add((Pet) context.getBean("pet"));
		pets.add((Pet) context.getBean("pet"));
		pets.add((Pet) context.getBean("pet"));
		pets.add((Pet) context.getBean("pet"));
		pets.add((Pet) context.getBean("pet"));
		
		Test test = (Test) context.getBean("test");
		test.ioService.savePet(pets);
		for(Pet pet : test.ioService.getPets()) {
			System.out.println(pet);
		}
		
		
	}

	public IOService getIoService() {
		return ioService;
	}

	public void setIoService(IOService ioService) {
		this.ioService = ioService;
	}
	
	
}
