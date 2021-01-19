package com.ars.airlineservice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.ars.companyService.AirIndiaService;
import com.ars.companyService.KingFisherService;

public class KingFisherSerCollection1 extends AirlineService implements IAddingFlightDetail  {
	


	@Override
	public void AddFlight() {
		// TODO Auto-generated method stub
		

		Map<String, KingFisherService> m_kingfisher = new HashMap<String ,KingFisherService>();
		
		KingFisherService kfs = new KingFisherService();
		
		kfs.setF_name(eElement.getElementsByTagName("f_name").item(0).getTextContent());
		kfs.setCompanyName(eElement.getElementsByTagName("companyName").item(0).getTextContent());
		kfs.setSrcStn(eElement.getElementsByTagName("srcStn").item(0).getTextContent());
		kfs.setDestnStn(eElement.getElementsByTagName("destnStn").item(0).getTextContent());
		kfs.setF_date(eElement.getElementsByTagName("f_date").item(0).getTextContent());
		kfs.setEconomt_t_fair(eElement.getElementsByTagName("economt_t_fair").item(0).getTextContent());
		kfs.setBusiness_t_fair(eElement.getElementsByTagName("business_t_fair").item(0).getTextContent());
		kfs.setFirst_t_fair(eElement.getElementsByTagName("first_t_fair").item(0).getTextContent());
		
		kfs.setNoOf_economy_c_seats(eElement.getElementsByTagName("economy_seats").item(0).getTextContent());
		kfs.setNoOf_business_c_seats(eElement.getElementsByTagName("business_seats").item(0).getTextContent());
		kfs.setNoOf_first_c_seats(eElement.getElementsByTagName("first_seats").item(0).getTextContent());
		
		m_kingfisher.put(eElement.getElementsByTagName("f_id").item(0).getTextContent(), kfs);
		Set<Entry<String, KingFisherService>> Set = m_kingfisher.entrySet();
		Iterator itr = Set.iterator();
		while(itr.hasNext()){
		//System.out.println("knffff");
			Entry entry = (Entry)itr.next();
			KingFisherService iddss=	(KingFisherService)entry.getValue();
		System.out.println("Key is"+entry.getKey());
		System.out.println("destn name is:"+iddss.getDestnStn());
		
		}
		//return null;
	}
	@Override
	public void DisplayFlightDetail(String f_id) {
		// TODO Auto-generated method stub
		
	}


}
