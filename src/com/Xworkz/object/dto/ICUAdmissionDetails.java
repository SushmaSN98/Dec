package com.Xworkz.object.dto;

public class ICUAdmissionDetails {
	private String patientName;
	private String severity;
	private String doctorName;
	private String nurseAssigned;
	int price;
	
	
	public ICUAdmissionDetails(String patientName,String severity,String doctorName,String nurseAssigned) {
		this.patientName=patientName;
		this.severity=severity;
		this.doctorName=doctorName;
		this.nurseAssigned=nurseAssigned;
		
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getNurseAssigned() {
		return nurseAssigned;
	}

	public void setNurseAssigned(String nurseAssigned) {
		this.nurseAssigned = nurseAssigned;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
