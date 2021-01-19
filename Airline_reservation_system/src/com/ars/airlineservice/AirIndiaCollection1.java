package com.ars.airlineservice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.ars.companyService.AirIndiaService;

public class AirIndiaCollection1 extends AirlineService implements IAddingFlightDetail , Serializable  {
	static Map<String, AirIndiaService> m_airindia = null;
	 Set<Entry<String, AirIndiaService>> set;
	@Override
	public void AddFlight() {
		// TODO Auto-generated method stub
		
		

		m_airindia = new HashMap<String ,AirIndiaService>();
		
		AirIndiaService airs = new AirIndiaService();
		
		airs.setF_name(eElement.getElementsByTagName("f_name").item(0).getTextContent());
		airs.setCompanyName(eElement.getElementsByTagName("companyName").item(0).getTextContent());
		airs.setSrcStn(eElement.getElementsByTagName("srcStn").item(0).getTextContent());
		airs.setDestnStn(eElement.getElementsByTagName("destnStn").item(0).getTextContent());
		airs.setF_date(eElement.getElementsByTagName("f_date").item(0).getTextContent());
		airs.setEconomt_t_fair(eElement.getElementsByTagName("economt_t_fair").item(0).getTextContent());
		airs.setBusiness_t_fair(eElement.getElementsByTagName("business_t_fair").item(0).getTextContent());
		airs.setFirst_t_fair(eElement.getElementsByTagName("first_t_fair").item(0).getTextContent());
		

		
		airs.setNoOf_economy_c_seats(eElement.getElementsByTagName("economy_seats").item(0).getTextContent());
		airs.setNoOf_business_c_seats(eElement.getElementsByTagName("business_seats").item(0).getTextContent());
		airs.setNoOf_first_c_seats(eElement.getElementsByTagName("first_seats").item(0).getTextContent());
		
		
	
		
		m_airindia.put(eElement.getElementsByTagName("f_id").item(0).getTextContent(), airs);
	
		
		/*try
	      {
	         FileOutputStream fileOut = new FileOutputStream("airIndia1.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(m_airindia);
	         out.close();
	         fileOut.close();
	        // System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      }catch(IOException i)
	      {
	          i.printStackTrace();
	      }*/
		// Set = m_airindia.entrySet();
		
		//Set<Entry<String, AirIndiaService>> Set = m_airindia.entrySet();
		/*set = m_airindia.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext())
		{ //System.out.println("Inside aair India");
			Entry entry = (Entry) itr.next();
			AirIndiaService iddss=(AirIndiaService)entry.getValue();
			System.out.println(" Air India Key is "+entry.getKey());
			System.out.println("destn"+iddss.getDestnStn());
			System.out.println("company name "+iddss.getCompanyName());
			System.out.println("Economy class seats: " +iddss.getEconomy_c_seats());
		}*/
	}
	@Override
	public void DisplayFlightDetail(String f_id) {
		// TODO Auto-generated method stub
		
		System.out.println("ravi");
		System.out.println("Entred Id is:"+f_id);
		//System.out.println(m_airindia);
	
		
		//Map<String, AirIndiaService> m_AirIndiatemp = null;
	/*	 try
	      {
	         FileInputStream fileIn = new FileInputStream("airIndia1.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         m_AirIndiatemp = (Map<String, AirIndiaService>) in.readObject();
	         in.close();
	         fileIn.close();
	      }catch(IOException i)
	      {
	         i.printStackTrace();
	         return;
	      }catch(ClassNotFoundException c)
	      {
	         System.out.println("MAp is not  found");
	         c.printStackTrace();
	         return;
	      }*/
		//System.out.println("valu after deserialize"+m_AirIndiatemp);
		
		
		
		 /*set = m_airindia.entrySet();
		
		Iterator itr2 = set.iterator();
		System.out.println("Gaurav..");
		while(itr2.hasNext())
		{ 
			Entry entry =(Entry)itr2.next();
			
			AirIndiaService iddss=(AirIndiaService)entry.getValue();
			System.out.println("sudhirrrr "+f_id);
			System.out.println("Get key value is:  "+entry.getKey());
			if(entry.getKey().equals(f_id))
			{
				System.out.println("Flight Name: "+iddss.getF_name());
				System.out.println("Company Name: "+iddss.getCompanyName());
				System.out.println("source Sation: "+iddss.getSrcStn());
				System.out.println("Destation Station: "+iddss.getDestnStn());
				System.out.println("Flight Date "+iddss.getF_date());
				System.out.println("No of Available seats in Economy Class "+iddss.getEconomy_c_seats());
				System.out.println(" Economy Class Fair "+iddss.getEconomt_t_fair());
				System.out.println("No of Available seats in Business Class "+iddss.getBusuness_c_seats());
				System.out.println(" Business Class Fair  "+iddss.getBusiness_t_fair());
				System.out.println("No of Available seats in First Class "+iddss.getFirst_c_seats());
				System.out.println("First Class Fair  "+iddss.getFirst_t_fair());
				
			}
			else {
				System.out.println("Your enter flight no did not match");
			}
			
		}*/
		
		
	}
	

}
