package day5_homework1_ecommerce_demo.business.abstracts;

import day5_homework1_ecommerce_demo.entities.concretes.User;

public interface UserCheckService {
	public boolean checkIfRealMail(String email);
}
