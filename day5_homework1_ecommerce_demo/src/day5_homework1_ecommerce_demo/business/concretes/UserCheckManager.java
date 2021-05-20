package day5_homework1_ecommerce_demo.business.concretes;

import day5_homework1_ecommerce_demo.business.abstracts.UserCheckService;
import day5_homework1_ecommerce_demo.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealMail(String email) {
		//
		return false;
	}

}
