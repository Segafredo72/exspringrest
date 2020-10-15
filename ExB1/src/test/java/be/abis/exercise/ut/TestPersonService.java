package be.abis.exercise.ut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import be.abis.exercise.service.PersonService;

public class TestPersonService {

	@Autowired
	PersonService ps;
	
	@Test
	void firstPersonFirstNameJohn() {
		int id = 1;
		assertEquals("John", ps.findPerson(id).getFirstName());
				
	}
	
}
