package com.Xworkz.object.dto;

public class CompanyDTO {
	private String name;
	private String place;
	private String type;
	private String website;
	private String CEO;
	
	public CompanyDTO(String name,String place) {
		this.name=name;
		this.place=place;
		
	}
	public CompanyDTO(String type,String website,String CEO) {
		this.type=type;
		this.website=website;
		this.CEO=CEO;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getCEO() {
		return CEO;
	}
	public void setCEO(String cEO) {
		CEO = cEO;
	}
	
	}
	


