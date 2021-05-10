package day4_homework3.business.abstracts;

import java.util.List;

import day4_homework3.entity.concretes.Gamer;
import day4_homework3.entity.concretes.Staff;

public interface StaffManagerService extends BasePersonManagerService{
	public void getStaffsInfo(Staff[] staffs);
}
