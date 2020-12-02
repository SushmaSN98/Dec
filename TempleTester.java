package com.Xworkz.copies;
import com.Xworkz.copies.constructor.Temple;

public class TempleTester {
	public static void main(String[] args)
	{
		Temple temple=new Temple("Krishna","Jamkhandi",6.00f,"puliyogare",9.00f);
		String name=temple.getName();
		String place=temple.getPlace();
		float openTime=temple.getOpenTime();
		String prasada=temple.getPrasada();
		float  closeTime=temple.getCloseTime();
		
		System.out.println(name);
		System.out.println(place);
		System.out.println(openTime);
		System.out.println(prasada);
		System.out.println(closeTime);
		
		temple.setPrasada("Laadu");
		prasada=temple.getPrasada();
		System.out.println("updated prasada"+prasada);
		
		
		
				
	}

}
