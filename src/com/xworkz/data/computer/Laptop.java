package com.xworkz.data.computer;

public class Laptop extends Computer {
	private double Storage;
	public boolean shutDown() {
		System.out.println("ivoked the shutDown method ");
		return false;
	}
	public double getStorage() {
		return Storage;
	}
	public void setStorage(double storage) {
		Storage = storage;
	}
	

}
