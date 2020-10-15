package be.abis.exercise.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.abis.exercise.exception.PersonCanNotBeDeletedException;
import be.abis.exercise.model.Login;
import be.abis.exercise.model.Person;
import be.abis.exercise.service.PersonService;

@RestController
@RequestMapping(path = "persons")
public class ApiController {

	@Autowired
	PersonService personService;
	
	
	@GetMapping("{id}")
	public Person returnPerson(@PathVariable("id") int id) {
	
	return personService.findPerson(id);
	
	} // localhost:8085/exercise/person/3
	
	@GetMapping("")
	public ArrayList<Person> returnAllPerson() {
	
	return personService.getAllPersons();
	
	} // localhost:8085/exercise/person/
	
	@PostMapping(path="")
	public void addNewPerson(@RequestBody Person person) throws IOException{
	personService.addPerson(person);
	}
	
	@PostMapping(path="login")
	public Person returnPersonByLogin(@RequestBody Login login) {
	return personService.findPerson(login.getEmail(), login.getPassword());
	}
	
	@DeleteMapping("{id}")
	public void removePersonById(@PathVariable("id") int id) throws PersonCanNotBeDeletedException {
	personService.deletePerson(id);	
	}
	
}
