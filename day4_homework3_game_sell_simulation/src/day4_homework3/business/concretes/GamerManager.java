package day4_homework3.business.concretes;

import java.util.List;

import day4_homework3.business.abstracts.CustomerCheckService;
import day4_homework3.business.abstracts.GamerService;
import day4_homework3.entity.abstracts.Person;
import day4_homework3.entity.concretes.Gamer;
import day4_homework3.entity.concretes.General;

public class GamerManager implements GamerService{

	CustomerCheckService customerCheckService;
	public GamerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Person person,General general) {
		general.setNumOfGamers(general.getNumOfGamers()+1);
		System.out.println(person.getFirstName()+" "+person.getLastName()+" is added to the system as a Gamer.");
		
	}

	@Override
	public void update(Person person) {
		
		System.out.println(person.getFirstName()+" "+person.getLastName()+" is updated .");
	}

	@Override
	public void delete(Person person,General general) {
		if(general.getNumOfGamers() > 0) {
			general.setNumOfGamers(general.getNumOfGamers()-1);
			System.out.println(person.getFirstName()+" "+person.getLastName()+" is deleted from the system.");
		}
		else {
			System.out.println("Invalid transaction!");
		}

		
	}

	@Override
	public void signUp(Gamer gamer,General general) { //Mernis doðrulama ile alakalý olan fonksiyonumuz.
		if(customerCheckService.CheckIfRealPerson(gamer)) {
			System.out.println("Saved : "+gamer.getFirstName()+" "+gamer.getLastName());
			this.save(gamer, general);
		}
		else {
			System.out.println("Not a valid customer");
		}
		
		
	}

	@Override
	public void getGamersInfo(Gamer[] gamers) {
		int counter = 1;
		System.out.println("************************");
		System.out.println("GAMERS : ");
		for(Gamer gamer : gamers) {
			System.out.println(counter + " ----------------------");
			System.out.println("Name    : "+gamer.getFirstName());
			System.out.println("Surname : "+gamer.getLastName());
			System.out.println("BirthD. : "+gamer.getDateOfBirth());
			counter++;
		}
		counter--;
		System.out.println("------------------------");
		System.out.println("Total gamer : "+counter);
		System.out.println("************************");
		counter = 0;
	}


}
