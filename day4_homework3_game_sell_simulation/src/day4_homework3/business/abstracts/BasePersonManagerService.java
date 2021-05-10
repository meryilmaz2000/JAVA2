package day4_homework3.business.abstracts;

import day4_homework3.entity.abstracts.Person;
import day4_homework3.entity.concretes.General;

public interface BasePersonManagerService {
	public void save(Person person,General general);
	public void update(Person person);
	public void delete(Person person,General general);
}
