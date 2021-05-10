package day4_homework3.business.abstracts;

import java.util.List;

import day4_homework3.entity.concretes.Gamer;
import day4_homework3.entity.concretes.General;

public interface GamerService extends BasePersonManagerService{
	public void signUp(Gamer gamer,General general);
	public void getGamersInfo(Gamer[] gamers);
}
