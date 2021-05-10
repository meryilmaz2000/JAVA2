package day4_homework3.business.abstracts;

import day4_homework3.entity.concretes.Campaign;
import day4_homework3.entity.concretes.General;

public interface CampaignManagerService {
	public void addCampaign(Campaign campaign,General general) ;
	public void deleteCampaign(Campaign campaign,General general) ;
	public void updateCampaign(Campaign campaign);
	public void printAll(Campaign[] campaigns);
}
