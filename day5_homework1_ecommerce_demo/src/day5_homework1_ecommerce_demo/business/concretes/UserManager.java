package day5_homework1_ecommerce_demo.business.concretes;

import java.util.List;

import day5_homework1_ecommerce_demo.business.abstracts.InfoControlService;
import day5_homework1_ecommerce_demo.business.abstracts.UserCheckService;
import day5_homework1_ecommerce_demo.business.abstracts.UserService;
import day5_homework1_ecommerce_demo.dataAccess.abstracts.UserDao;
import day5_homework1_ecommerce_demo.dataAccess.concretes.BaseUserDao;
import day5_homework1_ecommerce_demo.entities.concretes.User;

public class UserManager implements UserService{

	private UserCheckService userCheckService;
	private InfoControlService infoControlService;
	private UserDao userDao;
	
	
	


	public UserManager(UserCheckService userCheckService, InfoControlService infoControlService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.infoControlService = infoControlService;
		this.userDao = userDao;
	}

	
	
	@Override
	public void signUp(User user) {
		
		boolean c1,c2,c3,c4;
		
		c1 = infoControlService.emailCheck(user);
		c2 = infoControlService.passwordCheck(user);
		c3 = infoControlService.usernameCheck(user);
		c4 = infoControlService.isTaken(user, userDao.getAll());
		
		boolean result = c1 && c2 && c3 && c4;
		if(result && userCheckService.checkIfRealMail(user.getEmail())) {
			userDao.save(user);
			System.out.println("The registration process completed.");
		}
		else {
			System.out.println("! Make sure your all informations are suitable for given format.");
		}
		
		
		
	}

	@Override
	public void logIn(User user, List<User> users) {
		if(users.contains(user)) {
			System.out.println("Logged in : "+user.getFirstName() + " "+user.getLastName());
		}
		else {
			System.out.println("User not found");
		}
		
	}

}
