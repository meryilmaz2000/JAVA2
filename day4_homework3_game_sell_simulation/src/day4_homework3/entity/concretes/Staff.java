package day4_homework3.entity.concretes;

import day4_homework3.entity.abstracts.Person;

public class Staff extends Person{
	private String department;
	

	public Staff() {};

	public Staff(int id , String firstName , String lastName,String department) {
		super();
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName); 
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}
