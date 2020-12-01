package com.Xworkz.copies.constructor;

public class Aquarium {
	
	public String fish;
	public String water;
	public int size;
	public int cost;
	public Aquarium() {
		System.out.println("invoked default constructor");
	}
	public Aquarium(String fish) {
		System.out.println("invoked constructor with one string para ");
		this.fish=fish;
		
	}
	public Aquarium(String fish,String water) {
		System.out.println("invoked constructor with two string para");
		this.fish=fish;
		this.water=water;
	}
	public Aquarium(String water,int size) {
		System.out.println("invoked constructor with one string para and another int para");
		this.water=water;
		this.size=size;
	}
	public Aquarium(int size,int cost) {
		System.out.println("invoked constructor with two int para");
		this.size=size;
		this.cost=cost;
		
	}
	public Aquarium(int cost) {
		System.out.println("invoked constructor with one int para");
		this.cost=cost;
	}
}

		
	
	
	
		
