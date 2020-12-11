package com.Xworkz.object.dto;
import com.Xworkz.object.dto.Hospital;

public class Appointment {
	private String patientName;
	private int age;
	private long contactNo;
	private String reason;
	private String doctorName;
	
	public Appointment(String patientName,int age,long contactNo,String reason,String doctorName) {
		this.patientName=patientName;
		this.age=age;
		this.contactNo=contactNo;
		this.reason=reason;
		this.doctorName=doctorName;
		
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	

}
