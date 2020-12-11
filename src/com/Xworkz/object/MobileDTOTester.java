package com.Xworkz.object;

import com.Xworkz.object.dto.MobileDTO;


public class MobileDTOTester {
	public static void main(String[] args) {
		
		MobileDTO mobileDto=new MobileDTO("Redmi Note 8 Pro");
		System.out.println(mobileDto.getName());
		
		MobileDTO mobileDto2=new MobileDTO("Redmi","HaloWhite",4500,"64GB",16000);
		System.out.println(mobileDto2.getBrand());
		System.out.println(mobileDto2.getColour());
		System.out.println(mobileDto2.getBattery());
		System.out.println(mobileDto2.getStorage());
		System.out.println(mobileDto2.getPrice());
		
		
		
	}

}
