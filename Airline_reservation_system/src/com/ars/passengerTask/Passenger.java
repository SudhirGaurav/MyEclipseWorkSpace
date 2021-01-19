package com.ars.passengerTask;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;

import com.ars.airlineservice.AirIndiaCollection1;
import com.ars.airlineservice.AirlineService;
import com.ars.companyService.AirIndiaService;
import com.ars.model.PassengerDetail;

public class Passenger extends PassengerDetail implements IPassengerTask {

 
  
	public String genrate_UUID()
	{
		UUID id = UUID.randomUUID();
		String uid = String.valueOf(id);
		return uid;
	}

	@Override
	public void create_Passenger() {
		// TODO Auto-generated method stub
		String p_name_temp;
		String p_location_temp;
		
		
		System.out.println("Inside the Crete pasenger nmethod");
		PassengerDetail pd = new PassengerDetail();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		p_name_temp = in.nextLine();
		System.out.println("Enter your location");
		p_location_temp=in.nextLine();
		pd.setP_name(p_name_temp);
		pd.setP_location(p_location_temp);
		Map<String, PassengerDetail> m_p_detail = new HashMap<String, PassengerDetail>();
	
		m_p_detail.put(genrate_UUID(), pd);
	
		/* Set<Entry<String, PassengerDetail>> set = m_p_detail.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{ //System.out.println("Inside aair India");
			Entry entry = (Entry) itr.next();
			PassengerDetail pd_obj=(PassengerDetail)entry.getValue();
			System.out.println(" Passenger UUID: "+entry.getKey());
			System.out.println("name of passenger: "+pd_obj.getP_name());
			System.out.println("Location of passenger : "+pd_obj.getP_location());
			
		}*/
		
		System.out.println("Your account has been Created");
		System.out.println(" ");
		
	}

	@Override
	public void serch_flight( AirIndiaCollection1 acc) {
		
		// TODO Auto-generated method stub
		//System.out.println("Insside the search Flight");
		 Scanner in = new Scanner(System.in);
		 String src_stn ,dest_stn,date;
		 int choice , c_choice;
		System.out.println("Choose option for  The Flight Company Name");
		System.out.println("1=>AirIndia");
		System.out.println("2=>Indigo");
		System.out.println("3=>KingFisher");
		
		c_choice = in.nextInt();
		if(c_choice==1)// AirIndia
		{ 
				System.out.println("********* Welcome In The AirIndia zone*******");
				System.out.println("If you Know Flight No Then Press 1 otherwise Press 2");
				choice = in.nextInt();
				 if(choice==1){
				 System.out.println("Enter the flight Numberrrrr");
				 Scanner inn = new Scanner(System.in);
				 
				String  flight_no = inn.nextLine();
				 //AirIndiaCollection1 aic_obj = new AirIndiaCollection1(); // I think this is the problem Because I am making new obj of AirIndiaCollection1.
				 System.out.println("Flight no in the passenger class "+flight_no);
				// aic_obj.DisplayFlightDetail(flight_no);
				 acc.DisplayFlightDetail(flight_no);
				 
				 }
				if(choice==2)
				{
				 System.out.println("Enter Source Station:");
				 src_stn = in.nextLine();
				 System.out.println("Enter Destination Station");
				 dest_stn = in.nextLine();
				}
				 
				
				 
				// System.out.println("SuccessFully taken");
			
			
		}
		if(c_choice==2)
		{}
		
		if(c_choice==3)
		{}
		else 
			System.out.println("You have Entered Wrong Choice!!!");
		
		
	}
	
	@Override
	public void rettrive_Passenger() {
		// TODO Auto-generated method stub
		
	}

//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2 Booking of ticket @@@@@@@@@@@@@@@@@@@@@@@@@@2222	

	@Override
	public void book_ticket() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t_choice , c_choice , no_of_tkt;
		System.out.println("Firstlly Create your account!!!");
		create_Passenger();
		 
		System.out.println("Choose option for  The Flight Company Name");
		System.out.println("1=>AirIndia");
		System.out.println("2=>Indigo");
		System.out.println("3=>KingFisher");
		c_choice = in.nextInt();
			if(c_choice==1)// AirIndia
			{ 
					System.out.println("********* Welcome In The AirIndia zone*******");
					System.out.println("Enter the ticket Type ");
					System.out.println("1=>Economy");
					System.out.println("2=>Business");
					System.out.println("3=>First");
					
					t_choice = in.nextInt();
					if(t_choice==1) // Economy
					{
						System.out.println("Inside  the Economy Class Ticket  ");
						System.out.println("Enter the No of Ticket:");
						no_of_tkt=in.nextInt();
						System.out.println("");
						
					}
					if(t_choice==2)
					{
						System.out.println("Inside  the Business Class Ticket  ");
						System.out.println("Enter the No of Ticket:");
						no_of_tkt=in.nextInt();
						
					}
					if(t_choice==3)
					{
						System.out.println("Inside  the First Class Ticket  ");
						System.out.println("Enter the No of Ticket:");
						no_of_tkt=in.nextInt();
						
					}		 
			 }
					
			if(c_choice==2) // Indogo
			{
				System.out.println("********* Welcome In The Indigo zone*******");		
				System.out.println("Enter the ticket Type ");
				System.out.println("1=>Economy");
				System.out.println("2=>Business");
				System.out.println("3=>First");
				
				t_choice = in.nextInt();
				if(t_choice==1) // Economy
				{
					System.out.println("Inside  the Economy Class Ticket  ");
					System.out.println("Enter the No of Ticket:");
					no_of_tkt=in.nextInt();
					
				}
				
				if(t_choice==2)
				{
					System.out.println("Inside  the Business Class Ticket  ");
					System.out.println("Enter the No of Ticket:");
					no_of_tkt=in.nextInt();
					
				}
				if(t_choice==3)
				{
					System.out.println("Inside  the First Class Ticket  ");
					System.out.println("Enter the No of Ticket:");
					no_of_tkt=in.nextInt();
					
				}		 	
			}
			
			if(c_choice==3)// KingFisher
			{
				System.out.println("********* Welcome In The KingFisher zone*******");	
				System.out.println("Enter the ticket Type ");
				System.out.println("1=>Economy");
				System.out.println("2=>Business");
				System.out.println("3=>First");
				
				
				t_choice = in.nextInt();
				if(t_choice==1) // Economy
				{
					System.out.println("Inside  the Economy Class Ticket  ");
					System.out.println("Enter the No of Ticket:");
					no_of_tkt=in.nextInt();
					
				}
				
				if(t_choice==2) // business
				{
					System.out.println("Inside  the Business Class Ticket  ");
					System.out.println("Enter the No of Ticket:");
					no_of_tkt=in.nextInt();
					
				}
				if(t_choice==3)// first
				{
					System.out.println("Inside  the First Class Ticket  ");
					System.out.println("Enter the No of Ticket:");
					no_of_tkt=in.nextInt();	
				}		 
				
			}
			//else System.out.println("You have Entered Wrong Choice!!!");
	
	System.out.println("You have entered all details");
	}

	@Override
	public void cancile_ticket() {
		// TODO Auto-generated method stubso
		
	}

}
