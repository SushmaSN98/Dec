package com.Xworkz.copies.constructor;

public class Temple {
	private String name;
	private String place;
	private float  openTime;
	private String prasada;
	private float closeTime;
	public Temple(String name,String place,float openTime,String prasada,float closeTime)
	{
		System.out.println("invoked Temple constructor");
		this.name=name;
		this.place=place;
		this.openTime=openTime;
		this.prasada=prasada;
		this.closeTime=closeTime;
	}
	public String getName() {
		return name;
	}
	public String getPlace() {
		return place;
	}
	public float getOpenTime() {
		return openTime;
	}
	public String getPrasada() {
		return prasada;
	}
	public void setPrasada(String prasada) {
		this.prasada = prasada;
	}
	public float getCloseTime() {
		return closeTime;
	}
	

}
