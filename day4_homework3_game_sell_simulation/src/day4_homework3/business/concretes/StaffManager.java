package day4_homework3.business.concretes;

import java.util.List;

import day4_homework3.business.abstracts.StaffManagerService;
import day4_homework3.entity.abstracts.Person;
import day4_homework3.entity.concretes.Gamer;
import day4_homework3.entity.concretes.General;
import day4_homework3.entity.concretes.Staff;

public class StaffManager implements StaffManagerService{

	@Override
	public void save(Person person,General general) {
		general.setNumOfStaffs(general.getNumOfStaffs()+1);
		System.out.println(person.getFirstName()+" "+person.getLastName()+" is added to the system as a Staff.");
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" is updated .");
		
	}

	@Override
	public void delete(Person person,General general) {
		if(general.getNumOfStaffs()>0) {
			general.setNumOfStaffs(general.getNumOfStaffs()-1);
			System.out.println(person.getFirstName()+" "+person.getLastName()+" is deleted from the system.");
		}
		else {
			System.out.println("Invalid transaction!");
		}
	}

	@Override
	public void getStaffsInfo(Staff[] staffs) {
		int counter = 1;
		System.out.println("************************");
		System.out.println("STAFF : ");
		for(Staff staff : staffs) {
			System.out.println(counter + " ----------------------");
			System.out.println("Name      : "+staff.getFirstName());
			System.out.println("Surname   : "+staff.getLastName());
			System.out.println("Department: "+staff.getDepartment());
			counter++;
		}
		counter--;
		System.out.println("------------------------");
		System.out.println("Total staff : "+counter);
		System.out.println("************************");
		counter = 0;
		
	}

}
