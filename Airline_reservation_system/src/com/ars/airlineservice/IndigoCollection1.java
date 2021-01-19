package com.ars.airlineservice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.ars.companyService.AirIndiaService;
import com.ars.companyService.IndigoService;

public class IndigoCollection1 extends AirlineService implements IAddingFlightDetail  {
	

	
	public void AddFlight()
	{
		Map<String, IndigoService> m_indigo = new HashMap<String ,IndigoService>();
		
		IndigoService is = new IndigoService();
		
		is.setF_name(eElement.getElementsByTagName("f_name").item(0).getTextContent());
		is.setCompanyName(eElement.getElementsByTagName("companyName").item(0).getTextContent());
		is.setSrcStn(eElement.getElementsByTagName("srcStn").item(0).getTextContent());
		is.setDestnStn(eElement.getElementsByTagName("destnStn").item(0).getTextContent());
		is.setF_date(eElement.getElementsByTagName("f_date").item(0).getTextContent());
		is.setEconomt_t_fair(eElement.getElementsByTagName("economt_t_fair").item(0).getTextContent());
		is.setBusiness_t_fair(eElement.getElementsByTagName("business_t_fair").item(0).getTextContent());
		is.setFirst_t_fair(eElement.getElementsByTagName("first_t_fair").item(0).getTextContent());
		
		is.setNoOf_economy_c_seats(eElement.getElementsByTagName("economy_seats").item(0).getTextContent());
		is.setNoOf_business_c_seats(eElement.getElementsByTagName("business_seats").item(0).getTextContent());
		is.setNoOf_first_c_seats(eElement.getElementsByTagName("first_seats").item(0).getTextContent());
		
		m_indigo.put(eElement.getElementsByTagName("f_id").item(0).getTextContent(), is);
	
		
		Set<Entry<String, IndigoService>> Set = m_indigo.entrySet();
		Iterator itr = Set.iterator();
		while(itr.hasNext())
		{//System.out.println("Hiii count");
			Entry entry = (Entry) itr.next();
		IndigoService iddss=	(IndigoService)entry.getValue();
			System.out.println("Key is"+entry.getKey());
			System.out.println(" destn stn  "+iddss.getDestnStn());
		}
		//return null;
	}



	@Override
	public void DisplayFlightDetail(String f_id) {
		// TODO Auto-generated method stub
		
	}


}
