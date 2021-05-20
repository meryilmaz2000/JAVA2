package day5_homework1_ecommerce_demo.adapters;

import day5_homework1_ecommerce_demo.business.abstracts.UserCheckService;
import day5_homework1_ecommerce_demo.entities.concretes.User;

public class GoogleServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealMail(String email) {
		
		//Simulasyon . Do�rulama kodu onaylanmamas� durumlar� eklenip false return edilebilir ! Oncesinde mail do�rulamas� da eklenebilir vs.
		
		
		System.out.println("*The activation code has sent to your email : " + email);
		System.out.println("****************************");
		System.out.println("Verification code : 3452 ");
		System.out.println("Verification completed.");
		System.out.println("****************************");
		return true;
	}

}
