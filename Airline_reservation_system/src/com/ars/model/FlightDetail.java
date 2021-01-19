package com.ars.model;

import java.awt.List;
import java.sql.Date;
import java.util.*;

public class FlightDetail extends CompanyDetail {

	private int f_id;
	private String f_name;
	//private String f_companyName; // company name......... Have to remove the company name package
	private String srcStn;
	private String destnStn;
	private String f_date;
	private int noOfAvailableSeats;
	private String departure_time;
	private String arrival_time;
	private String typeOfSeats ;
	//ArrayList typeOfSeats = new ArrayList();

	
	
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	
	
	public int getNoOfAvailableSeats() {
		return noOfAvailableSeats;
	}
	public void setNoOfAvailableSeats(int noOfAvailableSeats) {
		this.noOfAvailableSeats = noOfAvailableSeats;
	}
	public String getF_days() {
		return f_date;
	}
	public void setF_days(String f_days) {
		this.f_date = f_days;
	}
	public String getSrcStn() {
		return srcStn;
	}
	public void setSrcStn(String srcStn) {
		this.srcStn = srcStn;
	}
	public String getDestnStn() {
		return destnStn;
	}
	public void setDestnStn(String destnStn) {
		this.destnStn = destnStn;
	}
	public String getF_date() {
		return f_date;
	}
	public void setF_date(String f_date) {
		this.f_date = f_date;
	}
	public String getTypeOfSeats() {
		return typeOfSeats;
	}
	public void setTypeOfSeats(String typeOfSeats) {
		this.typeOfSeats = typeOfSeats;
	}
	
	
	
	
}
