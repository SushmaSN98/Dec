package com.Xworkz.copies;

import com.Xworkz.copies.constructor.Paper;

public class PaperTester {
	public static void main(String[] args)
	{
		Paper paper=new Paper(20.00f,18.00f,"white");
		String brand=paper.getBrand();
		float width=paper.getWidth();
		float height=paper.getHeight();
		String colour=paper.getColour();
		
		System.out.println(brand);
		System.out.println(colour);
		System.out.println(width);
		System.out.println(height);
		 
		paper.setWidth(12.00f);
		width=paper.getWidth();
		System.out.println("updated width"+width);
		 
		paper.setHeight(8.00f);
		height=paper.getHeight();
		System.out.println("updated height"+height);
		 
		
		
	}

}
