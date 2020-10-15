package be.abis.exercise.ut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import be.abis.exercise.service.PersonService;

@SpringBootTest 
@RunWith(SpringRunner.class)
public class TestPersonService {

	@Autowired
	PersonService ps;
	
	@Test
	public void firstPersonFirstNameJohn() {
		int id = 1;
		assertEquals("John", ps.findPerson(id).getFirstName());
				
	}
	
}
