package com.Xworkz.object;
import com.Xworkz.object.dto.Hospital;
import com.Xworkz.object.dto.Appointment;

public class HospitalTester {

	public static void main(String[] args) {
		 Hospital hospital=new Hospital("Lakeview","Belguam");
			 System.out.println (hospital.getName());
			 System.out.println(hospital.getLocation());
		 
			 
			 hospital.Appointment("Sonal",16,8548636775l,"fever","Dr.Sunita");
			 Appointment appointment=hospital.getAppointment();
			System.out.println("Patient name::"+appointment.getPatientName());
			System.out.println("Age::"+appointment.getAge());
			System.out.println("ContactNo::"+appointment.getContactNo());
			System.out.println("Reason::"+appointment.getReason());
			System.out.println("Doctor name::"+appointment.getDoctorName()); 
			 
			 
			 
		 

	}

}
