package day4_homework3.entity.concretes;

import java.time.LocalDate;

import day4_homework3.entity.abstracts.Person;

public class Gamer extends Person{
	
	private String nationalityId;
	private LocalDate dateOfBirth;
	
	public Gamer() {};
	
	public Gamer(int id , String firstName , String lastName,String nationalityId, LocalDate dateOfBirth) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName); 
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
	
	
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
