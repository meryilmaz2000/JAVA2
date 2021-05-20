package day5_homework1_ecommerce_demo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5_homework1_ecommerce_demo.business.abstracts.InfoControlService;
import day5_homework1_ecommerce_demo.business.abstracts.UserCheckService;
import day5_homework1_ecommerce_demo.entities.concretes.User;

public class InfoControlManager implements InfoControlService{

	
	
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+.com";
		
	@Override
	public boolean isTaken(User user,List<User> userList) {
	
		
		ArrayList<String> emailList = new ArrayList<String>();
		
		for(User userx : userList) {
			emailList.add(userx.getEmail());
		}
		
		if(emailList.contains(user.getEmail())) {
			System.out.println("This email has already taken !");
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length()<6) {
			
			return false;
		}
		else {
			return true;
		}
		
		
		
	}

	@Override
	public boolean usernameCheck(User user) {
		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean emailCheck(User user) {
	
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.getEmail());
		if(matcher.matches()) {
			return true;
		}
		else {
			System.out.println("Invalid email format !");
			return false;
		}
		
	}

}
