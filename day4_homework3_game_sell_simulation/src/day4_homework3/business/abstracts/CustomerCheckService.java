package day4_homework3.business.abstracts;

import day4_homework3.entity.concretes.Gamer;

public interface CustomerCheckService {

	public boolean CheckIfRealPerson(Gamer gamer);
}
