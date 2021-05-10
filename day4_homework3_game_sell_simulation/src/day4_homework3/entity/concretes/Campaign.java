package day4_homework3.entity.concretes;

import java.time.LocalDate;

import day4_homework3.entity.abstracts.Entity;

public class Campaign implements Entity {

	private LocalDate endDate;
	private LocalDate startDate;
	private String campaignName;
	private float discountPerc;
	
	public Campaign() {};
	
	public Campaign(LocalDate endDate, LocalDate startDate, String campaignName, float discountPerc) {
		super();
		this.endDate = endDate;
		this.startDate = startDate;
		this.campaignName = campaignName;
		this.discountPerc = discountPerc;
	}

	
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public float getDiscountPerc() {
		return discountPerc;
	}

	public void setDiscountPerc(float discountPerc) {
		this.discountPerc = discountPerc;
	}

	
}
