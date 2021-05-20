package day5_homework1_ecommerce_demo.dataAccess.abstracts;

import java.util.List;

import day5_homework1_ecommerce_demo.entities.concretes.User;

public interface UserDao {

	public void save(User user);
	public void delete(User user);
	public void update(User user);
	public List<User> getAll();
}
