package day4_homework3.entity.concretes;

public class General { //deneme amaçlý ekledim. Ancak tam doðru mantýkla kurmadýðýmý düþünüyorum. Daha doðru bir dizayný mutlaka vardýr :)
	private double totalCash = 0;
	private int numOfCampaigns = 0;
	private int numOfGamers = 0;
	private int numOfStaffs = 0;
	private int numOfAdministrator = 0;
	private int numOfGame = 0;
	
	
	public double getTotalCash() {
		return totalCash;
	}
	public void setTotalCash(double totalCash) {
		this.totalCash = totalCash;
	}
	public int getNumOfCampaigns() {
		return numOfCampaigns;
	}
	public void setNumOfCampaigns(int numOfCampaigns) {
		this.numOfCampaigns = numOfCampaigns;
	}
	public int getNumOfGamers() {
		return numOfGamers;
	}
	public void setNumOfGamers(int numOfGamers) {
		this.numOfGamers = numOfGamers;
	}
	public int getNumOfStaffs() {
		return numOfStaffs;
	}
	public void setNumOfStaffs(int numOfStaffs) {
		this.numOfStaffs = numOfStaffs;
	}
	public int getNumOfAdministrator() {
		return numOfAdministrator;
	}
	public void setNumOfAdministrator(int numOfAdministrator) {
		this.numOfAdministrator = numOfAdministrator;
	}
	public int getNumOfGame() {
		return numOfGame;
	}
	public void setNumOfGame(int numOfGame) {
		this.numOfGame = numOfGame;
	}
	
}
