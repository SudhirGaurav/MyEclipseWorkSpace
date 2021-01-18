package com.example.interviewcandidate;

import java.util.List;

public class Candidate {

	String name;
	String panCard;
	boolean isReadyForLocate;
	float yearExp;
	String skill;
	List<String> previousCompany;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public boolean isReadyForLocate() {
		return isReadyForLocate;
	}
	public void setReadyForLocate(boolean isReadyForLocate) {
		this.isReadyForLocate = isReadyForLocate;
	}
	public float getYearExp() {
		return yearExp;
	}
	public void setYearExp(float yearExp) {
		this.yearExp = yearExp;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public List<String> getPreviousCompany() {
		return previousCompany;
	}
	public void setPreviousCompany(List<String> previousCompany) {
		this.previousCompany = previousCompany;
	}
	public Candidate(String name, String panCard, boolean isReadyForLocate,
			float yearExp, String skill, List<String> previousCompany) {
		super();
		this.name = name;
		this.panCard = panCard;
		this.isReadyForLocate = isReadyForLocate;
		this.yearExp = yearExp;
		this.skill = skill;
		this.previousCompany = previousCompany;
	}
	
	@Override
	public int hashCode()
	{
		return getPanCard()!=null ? getPanCard().hashCode(): 0; 
	}
	
	@Override
	public boolean equals( Object obj)
	{
		return true;
		
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", panCard=" + panCard
				+ ", isReadyForLocate=" + isReadyForLocate + ", yearExp="
				+ yearExp + ", skill=" + skill + ", previousCompany="
				+ previousCompany + "]";
	}
	
	
	
}
