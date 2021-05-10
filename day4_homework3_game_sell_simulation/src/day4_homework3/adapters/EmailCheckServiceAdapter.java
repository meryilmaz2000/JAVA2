package day4_homework3.adapters;

import day4_homework3.business.abstracts.CustomerCheckService;
import day4_homework3.entity.concretes.Gamer;

public class EmailCheckServiceAdapter implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		//Email doğrulaması sonrasında true olarak döndürülmüş olsun
		return true;
	}

}
