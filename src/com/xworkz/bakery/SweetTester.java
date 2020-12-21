package com.xworkz.bakery;
import com.xworkz.bakery.cake.Sweet;
import com.xworkz.bakery.cake.OrangeSweet;

public class SweetTester {

	public static void main(String[] args) {
		
		Sweet sweet=new Sweet();
		System.out.println(sweet.getName());
		System.out.println(sweet.getShape());
		System.out.println(sweet.getColour());
		
		sweet.setName("kaju");
		System.out.println(sweet.getName());
		sweet.setShape("diamondShape");
		System.out.println(sweet.getShape());
		sweet.setColour("Cream");
		System.out.println(sweet.getColour());
		
		OrangeSweet orange=new OrangeSweet();
		orange.setName("Ladu");
		System.out.println(orange.getName());
		orange.setShape("Round");
		System.out.println(orange.getShape());
		orange.setColour("Orange");
		System.out.println(orange.getColour());
		
		orange.setOrange(true);
		System.out.println(orange.isOrange());
		}
	

}
