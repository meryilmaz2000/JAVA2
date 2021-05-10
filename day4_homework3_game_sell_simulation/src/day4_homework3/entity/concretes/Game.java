package day4_homework3.entity.concretes;

import java.text.DecimalFormat;
import java.time.LocalDate;

import day4_homework3.entity.abstracts.Entity;

public class Game implements Entity{

	private String gameName;
	private double price;
	private LocalDate releaseDate;
	private Campaign campaign;
	private double discountedPrice;
	
	
	public Game() {};
	
	
	
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCampaign() {
		if(campaign != null) {
			return campaign.getCampaignName();
		}
		else {
			return "No Campaigns Defined"; 
		}
		
	}

	public void setCampaign(Campaign campaign) {
	
		this.campaign = campaign;
	}

	public double getDiscountedPrice() {  //set edilmiyor çünkü indirimli fiyat kampanya üzerinde saðlanan indirimle hesaplanacak.
		if(campaign != null) {
			discountedPrice = price - (price * campaign.getDiscountPerc() / 100);
		}
		else {
			discountedPrice = this.getPrice();
		}
		
		return discountedPrice;
	}

	
	
}
