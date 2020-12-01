package com.Xworkz.copies;

import com.Xworkz.copies.constructor.Museum;

public class MuseumTester {
	public static void main(String[] args)
	{
		Museum museum=new Museum("ArchiologicalMuseum","Hampi",1480);
		System.out.println("Name Of Museum"+museum.name);
		System.out.println("Place Of Museum"+museum.place);
		System.out.println("YOE Of Museum"+museum.YOE);
		System.out.println("**************************************");
		Museum museum2=new Museum("FolkloreMuseum","Mysore",1968);
		System.out.println("Name Of Museum"+museum2.name);
		System.out.println("Place Of Museum"+museum2.place);
		System.out.println("YOE Of Museum"+museum2.YOE);
		System.out.println("**************************************");
		Museum museum3=new Museum("Indira Gandhi Manav Sangrahalay","Mysore",1965);
		System.out.println("Name Of Museum"+museum3.name);
		System.out.println("Place Of Museum"+museum3.place);
		System.out.println("YOE Of Museum"+museum3.YOE);
		System.out.println("**************************************");
		
		
		
		
	}

}
