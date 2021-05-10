package day4_homework3.business.abstracts;

import day4_homework3.entity.concretes.Game;
import day4_homework3.entity.concretes.Gamer;
import day4_homework3.entity.concretes.General;

public interface GameService {
	public void addGame(Game game,General general) ;
	public void deleteGame(Game game,General general) ;
	public void updateGame(Game game);
	public void buyGame(Game game,Gamer gamer,General general);
	public void printAll(Game[] games);
	
}
