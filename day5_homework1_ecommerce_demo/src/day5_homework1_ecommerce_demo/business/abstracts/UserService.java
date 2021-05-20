package day5_homework1_ecommerce_demo.business.abstracts;

import java.util.List;

import day5_homework1_ecommerce_demo.entities.concretes.User;

public interface UserService {
	public void signUp(User user);
	public void logIn(User user,List<User> users);
	
}
