package day4_homework3.business.concretes;


import java.text.DecimalFormat;

import day4_homework3.business.abstracts.GameService;
import day4_homework3.entity.concretes.Campaign;
import day4_homework3.entity.concretes.Game;
import day4_homework3.entity.concretes.Gamer;
import day4_homework3.entity.concretes.General;

public class GameManager implements GameService{

	@Override
	public void addGame(Game game,General general) {
		general.setNumOfGame(general.getNumOfGame()+1);
		System.out.println("New game is added : "+game.getGameName());
		
	}

	@Override
	public void deleteGame(Game game,General general) {
		if(general.getNumOfGame()>0) {
			general.setNumOfGame(general.getNumOfGame()-1);
			System.out.println("Game is deleted : "+game.getGameName());
		}
		else {
			System.out.println("Invalid transaction!");
		}
	
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Game is updated : "+game.getGameName());
		
	}

	@Override
	public void buyGame(Game game,Gamer gamer,General general) {
		general.setTotalCash(general.getTotalCash()+game.getDiscountedPrice());
		System.out.println("Payment Completed : "+ game.getGameName()+" / "+ gamer.getFirstName()+" "+gamer.getLastName()+"("+new DecimalFormat("##.##").format(game.getDiscountedPrice())+"TL"+")");
	}

	@Override
	public void printAll(Game[] games) {
		System.out.println("****************************");
		System.out.println("GAMES :");
		int counter =1;
		for(Game game : games) {
			
			System.out.println(counter+" --------------------------");
			System.out.println("Game Name       : "+game.getGameName());
			System.out.println("Release Date    : "+game.getReleaseDate());
			System.out.println("Price           : "+game.getPrice()+"TL");
			System.out.println("Campaign        : "+game.getCampaign());
			System.out.println("Discounted Price: "+new DecimalFormat("##.##").format(game.getDiscountedPrice())+"TL");
			counter++;
		}
		counter--;
		System.out.println("----------------------------");
		System.out.println("Total Game : "+counter);
		System.out.println("****************************");
		
	}

	
}
