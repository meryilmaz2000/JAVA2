package day4_homework3.business.abstracts;

import day4_homework3.entity.concretes.General;

public interface AdministratorManagerService extends BasePersonManagerService{
	public void getAllInfo(General general);
	
}
