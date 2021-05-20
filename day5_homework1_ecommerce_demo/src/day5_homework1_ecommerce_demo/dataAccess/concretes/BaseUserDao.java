package day5_homework1_ecommerce_demo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5_homework1_ecommerce_demo.dataAccess.abstracts.UserDao;
import day5_homework1_ecommerce_demo.entities.concretes.User;

public class BaseUserDao implements UserDao{

	public ArrayList<User> users = new ArrayList<User>(); 
	
	@Override
	public void save(User user) {
		System.out.println("User is saved : "+user.getFirstName() + " "+user.getLastName());
		users.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println("User is deleted : "+user.getFirstName() + " "+user.getLastName());
		users.remove(user);
	}

	@Override
	public void update(User user) {
		System.out.println("User is updated : "+user.getFirstName() + " "+user.getLastName());
	}

	@Override
	public List<User> getAll() {
		return users;
	}
	
}
