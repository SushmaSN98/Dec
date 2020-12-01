package com.Xworkz.copies;

import com.Xworkz.copies.constructor.Aquarium;

public class AquariumTester {
public static void main(String[] args)
{
	Aquarium aquarium=new Aquarium();
	System.out.println(aquarium.fish);
	System.out.println(aquarium.water);
	System.out.println(aquarium.size);
	System.out.println(aquarium.cost);
	
	Aquarium aquarium1=new Aquarium("Oscar");
	System.out.println(aquarium1.fish);
	
	Aquarium aquarium2=new Aquarium("GoldFish","Freshwater");
	System.out.println(aquarium2.fish);
	System.out.println(aquarium2.water);
	
	Aquarium aquarium3=new Aquarium(24,1149);
	System.out.println(aquarium3.size);
	System.out.println(aquarium3.cost);
	
	
	
}
}
