package be.abis.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	
}
