package com.ars.model;

import java.io.Serializable;

public class TicketDetail extends FlightDetail implements Serializable {
	
	private long UUID;
	private String economy_c_seats;
	private String noOf_economy_c_seats;
	private String  economt_t_fair;
	
	private String busuness_c_seats;
	private String noOf_business_c_seats;
	private String  business_t_fair;
	
	
	private String first_c_seats;
	private String noOf_first_c_seats;
	private String  first_t_fair;
	public long getUUID() {
		return UUID;
	}
	public void setUUID(long uUID) {
		UUID = uUID;
	}
	public String getEconomy_c_seats() {
		return economy_c_seats;
	}
	public void setEconomy_c_seats(String economy_c_seats) {
		this.economy_c_seats = economy_c_seats;
	}
	public String getNoOf_economy_c_seats() {
		return noOf_economy_c_seats;
	}
	public void setNoOf_economy_c_seats(String noOf_economy_c_seats) {
		this.noOf_economy_c_seats = noOf_economy_c_seats;
	}
	public String getEconomt_t_fair() {
		return economt_t_fair;
	}
	public void setEconomt_t_fair(String economt_t_fair) {
		this.economt_t_fair = economt_t_fair;
	}
	public String getBusuness_c_seats() {
		return busuness_c_seats;
	}
	public void setBusuness_c_seats(String busuness_c_seats) {
		this.busuness_c_seats = busuness_c_seats;
	}
	public String getNoOf_business_c_seats() {
		return noOf_business_c_seats;
	}
	public void setNoOf_business_c_seats(String noOf_business_c_seats) {
		this.noOf_business_c_seats = noOf_business_c_seats;
	}
	public String getBusiness_t_fair() {
		return business_t_fair;
	}
	public void setBusiness_t_fair(String business_t_fair) {
		this.business_t_fair = business_t_fair;
	}
	public String getFirst_c_seats() {
		return first_c_seats;
	}
	public void setFirst_c_seats(String first_c_seats) {
		this.first_c_seats = first_c_seats;
	}
	public String getNoOf_first_c_seats() {
		return noOf_first_c_seats;
	}
	public void setNoOf_first_c_seats(String noOf_first_c_seats) {
		this.noOf_first_c_seats = noOf_first_c_seats;
	}
	public String getFirst_t_fair() {
		return first_t_fair;
	}
	public void setFirst_t_fair(String first_t_fair) {
		this.first_t_fair = first_t_fair;
	}
	
	
		
	
	
}
