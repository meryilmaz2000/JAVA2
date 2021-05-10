package day4_homework3.business.concretes;

import day4_homework3.business.abstracts.CampaignManagerService;

import day4_homework3.entity.concretes.Campaign;
import day4_homework3.entity.concretes.General;

public class CampaignManager implements CampaignManagerService{

	@Override
	public void addCampaign(Campaign campaign,General general) {
		general.setNumOfCampaigns(general.getNumOfCampaigns()+1);
		System.out.println("New campaign is created : "+campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign,General general) {
		if(general.getNumOfCampaigns()>0) {
			general.setNumOfCampaigns(general.getNumOfCampaigns()-1);
			System.out.println("Campaign is deleted : "+campaign.getCampaignName());
			
		}
		
		else {
			System.out.println("Invalid transaction!");
		}
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Campaign is updated : "+campaign.getCampaignName());
		
	}

	@Override
	public void printAll(Campaign[] campaigns) {
		System.out.println("****************************");
		System.out.println("CAMPAIGNS :");
		int counter =1;
		for(Campaign campaign : campaigns) {
			
			System.out.println(counter+" --------------------------");
			System.out.println("Campaign Name : "+campaign.getCampaignName());
			System.out.println("Start Date    : "+campaign.getStartDate());
			System.out.println("End Date      : "+campaign.getEndDate());
			System.out.println("Discount Perc.: "+campaign.getDiscountPerc()+"%");
			counter++;
		}
		counter--;
		System.out.println("----------------------------");
		System.out.println("Total Campaign : "+counter);
		System.out.println("****************************");
		
	}

	
}
