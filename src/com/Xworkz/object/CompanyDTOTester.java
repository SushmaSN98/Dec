package com.Xworkz.object;
import com.Xworkz.object.dto.CompanyDTO;

public class CompanyDTOTester {
	public static void main(String[] args) {
		
		CompanyDTO companyDto=new CompanyDTO("wistron","Bengaluru");
		System.out.println(companyDto.getName());
		System.out.println(companyDto.getPlace());
		
		CompanyDTO companyDto2=new CompanyDTO("Origin Design Manufacturing","www.wistron.com","Robert Hwang");
		System.out.println(companyDto2.getType());
		System.out.println(companyDto2.getWebsite());
		System.out.println(companyDto.getCEO());
		
		
		
		
	
	
	}
}
