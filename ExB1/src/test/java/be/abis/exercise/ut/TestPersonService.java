package be.abis.exercise.ut;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import be.abis.exercise.service.ApiPersonService;

@SpringBootTest 
@RunWith(SpringRunner.class)
public class TestPersonService {

	@Autowired
	ApiPersonService aps;
	
	@Test
	public void firstPersonFirstNameJohn() {
		int id = 1;
		assertEquals("John", aps.findPerson(id).getFirstName());
				
	}
	
}
