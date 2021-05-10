package day4_homework3.entity.concretes;

import day4_homework3.entity.abstracts.Person;

public class Administrator extends Person{
	private String telephoneNumber;
	
	
	 
	public Administrator() {};

	public Administrator(int id , String firstName , String lastName,String telephoneNumber) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName); 
		this.telephoneNumber = telephoneNumber;
	}
	

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	 
}
