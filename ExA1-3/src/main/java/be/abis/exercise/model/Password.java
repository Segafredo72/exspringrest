package be.abis.exercise.model;

import javax.validation.constraints.Size;

public class Password {
	@Size(min=6, message="password has to be minimum 6 characters")
	private String password;	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
