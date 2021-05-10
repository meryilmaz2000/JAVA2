package day4_homework3.adapters;

import day4_homework3.business.abstracts.CustomerCheckService;
import day4_homework3.entity.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	boolean checkResult = false;
	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	
	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		try {
			checkResult = client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId())
											,gamer.getFirstName(),
											 gamer.getLastName(),
											 gamer.getDateOfBirth().getYear());
			
			}
		catch (Exception e) 
			{	
			System.out.println("Invalid person");
			}	
			
		return checkResult;	
	}
	
	
}
