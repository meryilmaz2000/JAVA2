package day4_homework3.business.concretes;

import java.text.DecimalFormat;

import day4_homework3.business.abstracts.AdministratorManagerService;
import day4_homework3.entity.abstracts.Person;
import day4_homework3.entity.concretes.Administrator;
import day4_homework3.entity.concretes.General;

public class AdministratorManager implements AdministratorManagerService{
	
	@Override
	public void save(Person person,General general) {
		general.setNumOfAdministrator(general.getNumOfAdministrator()+1);

		System.out.println(person.getFirstName()+" "+person.getLastName()+" is added to the system as an administrator.");
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName()+" "+person.getLastName()+" is updated .");
		
	}

	@Override
	public void delete(Person person,General general) {
		if(general.getNumOfAdministrator() > 0) {
			general.setNumOfGamers(general.getNumOfGamers()-1);
			System.out.println(person.getFirstName()+" "+person.getLastName()+" is deleted from the system.");
		}
		else {
			System.out.println("Invalid transaction!");
		}
		
	}

	@Override
	public void getAllInfo(General general) {//Aslýnda sirkete dair tüm bilgileri general manager içerisinde bastýrmak daha mantýklý.
		System.out.println("*****************************");
		System.out.println("GENERAL INFORMATION ");
		System.out.println("-----------------------------");
		System.out.println("Number of Administrator : "+general.getNumOfAdministrator());
		System.out.println("Number of Staff         : "+general.getNumOfStaffs());
		System.out.println("-----------------------------");
		System.out.println("Number of Game          : "+general.getNumOfGame());
		System.out.println("Number of Campaigns     : "+general.getNumOfCampaigns());
		System.out.println("-----------------------------");
		System.out.println("Number of Gamer         : "+general.getNumOfGamers());
		System.out.println("-----------------------------");
		System.out.println("Total Capital : "+new DecimalFormat("##.##").format(general.getTotalCash())+" TL");
		System.out.println("*****************************");
	}

}
