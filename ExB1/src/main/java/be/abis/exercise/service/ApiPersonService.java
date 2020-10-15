package be.abis.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import be.abis.exercise.model.Login;
import be.abis.exercise.model.Person;

@Service
public class ApiPersonService implements PersonService {
	
	@Autowired
	private RestTemplate rt;
	
	private String baseUri = "http://localhost:8085/exercise/api/persons";
	
	@Override
	public Person findPerson(int id) {
		return rt.getForObject(baseUri+"/"+id,Person.class);
		
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findPerson(String emailAddress, String passWord) {
		Login login = new Login();
		login.setEmail(emailAddress);
		login.setPassword(passWord);
		return rt.postForObject(baseUri+"/login",login,Person.class);
		
	}

	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(Person p, String newPwd) {
		// TODO Auto-generated method stub
		
	}

}
