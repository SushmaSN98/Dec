package com.Xworkz.object.dto;
import com.Xworkz.object.dto.Appointment;

public class Hospital {
	private String name;
	private String location;
	private Appointment appointment;
	
	public Hospital(String name,String location)
	{
		System.out.println("Hospital constructor called with 2 parameter");
		this.name=name;
		this.location=location;
	}
	public void Appointment(String patientName,int age,long contactNo,String reason,String doctorName)
	{
	 this.appointment=new Appointment(patientName,age,contactNo,reason,doctorName);
	 
	 
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	

}
