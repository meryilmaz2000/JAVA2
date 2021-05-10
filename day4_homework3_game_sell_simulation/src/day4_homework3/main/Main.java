package day4_homework3.main;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;

import day4_homework3.adapters.EmailCheckServiceAdapter;
import day4_homework3.adapters.MernisServiceAdapter;
import day4_homework3.business.abstracts.CampaignManagerService;
import day4_homework3.business.abstracts.CustomerCheckService;
import day4_homework3.business.concretes.AdministratorManager;
import day4_homework3.business.concretes.CampaignManager;
import day4_homework3.business.concretes.GameManager;
import day4_homework3.business.concretes.GamerManager;
import day4_homework3.business.concretes.StaffManager;
import day4_homework3.entity.concretes.Administrator;
import day4_homework3.entity.concretes.Campaign;
import day4_homework3.entity.concretes.Game;
import day4_homework3.entity.concretes.Gamer;
import day4_homework3.entity.concretes.General;
import day4_homework3.entity.concretes.Staff;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerCheckService customerCheckService = new MernisServiceAdapter();
		CustomerCheckService customerCheckService2 = new EmailCheckServiceAdapter();
		
		//MANAGERLAR TANIMLANDI
		GamerManager gamerManager = new GamerManager(customerCheckService2);
		GamerManager gamerManager2 = new GamerManager(customerCheckService);
		AdministratorManager administratorManager = new AdministratorManager();
		StaffManager staffManager = new StaffManager();
		CampaignManager campaignManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		
		General general = new General();
		
		//GAMERLAR
		
		Gamer gamer = new Gamer();
		gamer.setId(1);
		gamer.setFirstName("Yusuf Can");
		gamer.setLastName("Kahraman");
		gamer.setNationalityId("12345678911");
		gamer.setDateOfBirth(LocalDate.of(2000, 6, 18));
		
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(2);
		gamer1.setFirstName("Mehmetcan");
		gamer1.setLastName("Gökçe");
		gamer1.setNationalityId("42375890015");
		gamer1.setDateOfBirth(LocalDate.of(1999, 9, 4));
		
		Gamer gamer2 = new Gamer();
		gamer2.setId(3);
		gamer2.setFirstName("Umut");
		gamer2.setLastName("Baklacý");
		gamer2.setNationalityId("72378760013");
		gamer2.setDateOfBirth(LocalDate.of(2001, 1, 3));
		
		Gamer gamer3 = new Gamer();
		gamer3.setId(4);
		gamer3.setFirstName("Göktuð");
		gamer3.setLastName("Þimþek");
		gamer3.setNationalityId("87324657982");
		gamer3.setDateOfBirth(LocalDate.of(2001, 4, 27));
		
		
		//KAMPANYALAR
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignName("Yaza merhaba");
		campaign1.setDiscountPerc(30);
		campaign1.setStartDate(LocalDate.of(2021, 5, 20));
		campaign1.setEndDate(LocalDate.of(2021, 9, 20));
		
		Campaign campaign2 = new Campaign();
		campaign2.setCampaignName("Gamer Günleri");
		campaign2.setDiscountPerc(55);
		campaign2.setStartDate(LocalDate.of(2021, 6, 10));
		campaign2.setEndDate(LocalDate.of(2021, 6, 20));
		
		
		
		
		//OYUNLAR
		
		Game game1 = new Game();
		game1.setCampaign(campaign1);
		game1.setGameName("Age of Empires IV");
		game1.setPrice(250);
		game1.setReleaseDate(LocalDate.of(2021, 5, 15));
		
		Game game2 = new Game();
		game2.setCampaign(campaign2);
		game2.setGameName("World of Warcraft");
		game2.setPrice(349.99);
		game2.setReleaseDate(LocalDate.of(2009, 10, 10));
		
		Game game3 = new Game();
		game3.setCampaign(null);
		game3.setGameName("Dota II");
		game3.setPrice(130);
		game3.setReleaseDate(LocalDate.of(2012, 6, 16));
		
		Game game4 = new Game();
		game4.setCampaign(campaign1);
		game4.setGameName("CS-GO");
		game4.setPrice(74.99);
		game4.setReleaseDate(LocalDate.of(2008, 12, 4));
		
		Game game5 = new Game();
		game5.setCampaign(null);
		game5.setGameName("Battlefield 3");
		game5.setPrice(199.99);
		game5.setReleaseDate(LocalDate.of(2020, 10, 5));
		
		
		//YONETÝCÝLER
		
		Administrator administrator = new Administrator();
		administrator.setId(100);
		administrator.setFirstName("Engin");
		administrator.setLastName("Demiroð");
		administrator.setTelephoneNumber("505 555 55 55");
		
		
		//ÇALIÞANLAR
		
		Staff staff = new Staff();
		staff.setFirstName("Melikþah");
		staff.setLastName("Eryýlmaz");
		staff.setId(101);
		staff.setDepartment("Sales Consultant");
		
		Staff staff2 = new Staff();
		staff2.setFirstName("Kerem");
		staff2.setLastName("Varýþ");
		staff2.setId(102);
		staff2.setDepartment("Campaign Management Department");
		
		Staff staff3 = new Staff();
		staff3.setFirstName("Emre");
		staff3.setLastName("Alagöz");
		staff3.setId(103);
		staff3.setDepartment("");
		
		Gamer[] gamers = new Gamer[] {gamer,gamer1,gamer2,gamer3};
		Staff[] staffs = new Staff[] {staff,staff2,staff3};
		Game[] games = new Game[] {game1,game2,game3,game4,game5};
		Campaign[] campaigns = new Campaign[] {campaign1,campaign2};
		
		//System.out.println(new DecimalFormat("##.##").format(game4.getDiscountedPrice())); //baþta yazýlan ifade virgulden sonraki iki basamaða kadar küsurat verilmesi için eklendi.
		
		administratorManager.getAllInfo(general);
		administratorManager.save(administrator, general);
		System.out.println("");
		gameManager.addGame(game1,general);
		gameManager.addGame(game2,general);
		gameManager.addGame(game3,general);
		gameManager.addGame(game4,general);
		gameManager.addGame(game5,general);
		System.out.println("");
		gamerManager.signUp(gamer3,general);
		gamerManager.signUp(gamer2,general);
		gamerManager.signUp(gamer,general);
		gamerManager2.signUp(gamer1,general); //Mernis sorgu ile çekildi veriler doðru olmadýðýndan geçersiz.
		gamerManager.signUp(gamer1,general);//Email sorgusu ile eklendi
		System.out.println("");
		staffManager.save(staff3, general);
		staffManager.save(staff, general);
		staffManager.save(staff2, general);
		System.out.println("");
		administratorManager.getAllInfo(general);
		System.out.println("");
		campaignManager.addCampaign(campaign1, general);
		campaignManager.addCampaign(campaign2, general);
		System.out.println("");
		campaignManager.printAll(campaigns);
		System.out.println("");
		gameManager.printAll(games);
		System.out.println("");
		gameManager.updateGame(game3);
		System.out.println("");
		staffManager.getStaffsInfo(staffs);
		System.out.println("");
		administratorManager.getAllInfo(general);
		System.out.println("");
		gameManager.buyGame(game4, gamer2, general);
		gameManager.buyGame(game4, gamer3, general);
		gameManager.buyGame(game5, gamer1, general);
		gameManager.buyGame(game5, gamer, general);
		gameManager.buyGame(game2, gamer2, general);
		gameManager.buyGame(game2, gamer3, general);
		gameManager.buyGame(game2, gamer1, general);
		gameManager.buyGame(game1, gamer3, general);
		gameManager.buyGame(game1, gamer, general);
		gameManager.buyGame(game1, gamer2, general);
		gameManager.buyGame(game3, gamer2, general);
		System.out.println("");
		administratorManager.getAllInfo(general);
		System.out.println("");
		staffManager.delete(staff3, general);
		gameManager.deleteGame(game5, general);
		campaignManager.deleteCampaign(campaign1, general);
		System.out.println("");
		administratorManager.getAllInfo(general);
		System.out.println("");
		gameManager.buyGame(game4, gamer1, general);
		System.out.println("");
		administratorManager.getAllInfo(general);
		
		
		
		
	}

}
