package be.abis.exercise.ut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import be.abis.exercise.service.ApiPersonService;
import be.abis.exercise.service.PersonService;

public class TestPersonService {

	@Autowired
	ApiPersonService aps;
	
	@Test
	void firstPersonFirstNameJohn() {
		int id = 1;
		assertEquals("John", aps.findPerson(id).getFirstName());
				
	}
	
}
