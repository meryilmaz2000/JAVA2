package day5_homework1_ecommerce_demo;

import day5_homework1_ecommerce_demo.adapters.GoogleServiceAdapter;
import day5_homework1_ecommerce_demo.business.abstracts.UserCheckService;
import day5_homework1_ecommerce_demo.business.concretes.InfoControlManager;
import day5_homework1_ecommerce_demo.business.concretes.UserManager;
import day5_homework1_ecommerce_demo.dataAccess.abstracts.UserDao;
import day5_homework1_ecommerce_demo.dataAccess.concretes.BaseUserDao;
import day5_homework1_ecommerce_demo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {


		User user = new User();
		user.setEmail("meliksah@gmail.com");
		user.setPassword("546328");
		user.setFirstName("Melikþah");
		user.setLastName("Eryýlmaz");
		
		User user1 = new User();
		user1.setEmail("yusufcan@hotmail.com");
		user1.setPassword("938123");
		user1.setFirstName("Yusufcan");
		user1.setLastName("Kahraman");
		
		User user2 = new User();
		user2.setEmail("mehmetcan@gmail.com");
		user2.setPassword("44");
		user2.setFirstName("Mehmetcan");
		user2.setLastName("Gökçe");
		
		User user3 = new User();
		user3.setEmail("goktugsim@gmail.com");
		user3.setPassword("919192");
		user3.setFirstName("G");
		user3.setLastName("Þimþek");
		
		User user4 = new User();
		user4.setEmail("umutbaklaci@gmail.com");
		user4.setPassword("umut4882");
		user4.setFirstName("Umut");
		user4.setLastName("Baklacý");
		
		User user5 = new User();
		user5.setEmail("simay2@gmail.com");
		user5.setPassword("019simay");
		user5.setFirstName("Simay");
		user5.setLastName("Kaynar");
		
		User user6 = new User();
		user6.setEmail("simay2@gmail.com");
		user6.setPassword("111111");
		user6.setFirstName("Simay");
		user6.setLastName("Kaynar");
		
		User userNoSign = new User();
		userNoSign.setEmail("notSigned@gmail.com");
		userNoSign.setPassword("12837542");
		userNoSign.setFirstName("Unknown");
		userNoSign.setLastName("Person");
		
		User user7 = new User();
		user7.setEmail("meliksah2@kodlama.io");
		user7.setPassword("111111");
		user7.setFirstName("Can");
		user7.setLastName("Kaman");
		
		UserCheckService googCheckService = new GoogleServiceAdapter();
		BaseUserDao baseUserDao = new BaseUserDao();
		InfoControlManager infoControlManager = new InfoControlManager();
		UserManager userManager = new UserManager(googCheckService, infoControlManager, baseUserDao);
		userManager.signUp(user);
		System.out.println();
		userManager.signUp(user1);
		System.out.println();
		userManager.signUp(user2);
		System.out.println();
		userManager.signUp(user3);
		System.out.println();
		userManager.signUp(user4);
		System.out.println();
		userManager.signUp(user5);
		System.out.println();
		userManager.signUp(user6);
		System.out.println();
		userManager.signUp(user7);
		System.out.println();
		userManager.logIn(user, baseUserDao.getAll());
		userManager.logIn(user1, baseUserDao.getAll());
		userManager.logIn(user2, baseUserDao.getAll());
		userManager.logIn(user3, baseUserDao.getAll()); //Kod cýktýsýnda 'user not found' deme sbeebi hatali bilgiler nedeni ile kaydolamamýþ olmalarýdýr.
		userManager.logIn(user4, baseUserDao.getAll());
		userManager.logIn(user5, baseUserDao.getAll());
		userManager.logIn(user6, baseUserDao.getAll());
		userManager.logIn(userNoSign, baseUserDao.getAll());
		userManager.logIn(user7, baseUserDao.getAll());
		System.out.println();
		baseUserDao.delete(user);
		userManager.logIn(user, baseUserDao.getAll());
		System.out.println();
		baseUserDao.update(user1);
	}

}
