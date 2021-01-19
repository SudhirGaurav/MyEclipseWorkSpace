package com.ars.airlineservice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.ars.companyService.AirIndiaService;
import com.ars.companyService.IndigoService;
import com.ars.companyService.KingFisherService;
import com.ars.passengerTask.Passenger;




public class AirlineService {

	static Node nNode;
	static Element eElement;
	
	static AirIndiaCollection1 ac;
	static IndigoCollection1 ic ;
	static	KingFisherSerCollection1 kc;
	
	static Map<String, AirIndiaService> m_temp;
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File fXmlFile = new File("Flight_Detail.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element is :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("flight");
		 
			System.out.println("*******************************************************");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
		 
				//Node nNode = nList.item(temp);
				 nNode = nList.item(temp);
				
				//For sure of the Root node......
		 
				//System.out.println("\nCurrent Element is :" + nNode.getNodeName());
		 
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		 
					//Element eElement = (Element) nNode;
					 eElement = (Element) nNode;
					
//					System.out.println("Flight Id : " + eElement.getElementsByTagName("f_id").item(0).getTextContent());
//					System.out.println("Flight Name : " + eElement.getElementsByTagName("f_name").item(0).getTextContent());
//					System.out.println("Company Name : " + eElement.getElementsByTagName("companyName").item(0).getTextContent());
//					System.out.println("Source stn : " + eElement.getElementsByTagName("srcStn").item(0).getTextContent());	
//					System.out.println("destination stn : " + eElement.getElementsByTagName("destnStn").item(0).getTextContent());
//					System.out.println("Flite date : " + eElement.getElementsByTagName("f_date").item(0).getTextContent());
//					System.out.println("Economy Class Fair : " + eElement.getElementsByTagName("economt_t_fair").item(0).getTextContent());
//					System.out.println("Business Fair: " + eElement.getElementsByTagName("business_t_fair").item(0).getTextContent());
//					System.out.println("First Class Fair: " + eElement.getElementsByTagName("first_t_fair").item(0).getTextContent());
//					System.out.println("************************************************************");
			   
				
					if (eElement.getElementsByTagName("companyName").item(0).getTextContent().equals("airindia")){
						
						System.out.println(eElement.getElementsByTagName("companyName").item(0).getTextContent()+" if condn");
						 ac = new AirIndiaCollection1();
						ac.AddFlight(); // Calling the method AddFlight for addition of the flight Detail in the HashMap.
					
					}
					

					else if (eElement.getElementsByTagName("companyName").item(0).getTextContent().equals("indigo")){
						//System.out.println("Hi Indogo ASirrrrr");
						
						 ic = new IndigoCollection1();
						ic.AddFlight();
					}
					else if (eElement.getElementsByTagName("companyName").item(0).getTextContent().equals("kingfisher")){
						 kc = new KingFisherSerCollection1();
						kc.AddFlight();
					}
					else
					{
						System.out.println("I am not indigo");
					}
				}
			}
		}
		     catch (Exception e)
				{
			      e.printStackTrace();
		    	}
	
	
	System.out.println("**********Welcome to the Indian AirLine Reservation System*********");
	System.out.println();
	int choice = 0 ;
	Passenger p = new Passenger();
	
	
	do{
		System.out.println("Press 1=>Cterating your Account ,2=>SEARCH FLIGHT ,3=>BOOk TICKET Or 9 For LouOut!!!");
		Scanner s = new Scanner(System.in);
		choice = s.nextInt();
		
	switch (choice) {
	case 1:
	p.create_Passenger();
		break;
		
	case 2:
		p.serch_flight(ac);
			break;	
		
	case 3:
		p.book_ticket();
			break;
			
	default:
		
		//System.out.println("You have Entered Worng Choice");
		break;
	}
	}while(choice!= 9);
	
	System.out.println("You have LogedOut of this Website!!!");
	}
}
