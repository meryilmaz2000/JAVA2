package day5_homework1_ecommerce_demo.business.abstracts;

import java.util.List;

import day5_homework1_ecommerce_demo.entities.concretes.User;

public interface InfoControlService {
	public boolean isTaken(User user, List<User> userList);
	public boolean passwordCheck(User user);
	public boolean usernameCheck(User user);
	public boolean emailCheck(User user);
}
