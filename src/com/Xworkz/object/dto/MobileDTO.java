package com.Xworkz.object.dto;

public class MobileDTO {
	private String name;
	private String brand;
	private String colour;
	private int battery;
	private String storage;
	private int price;
	

public MobileDTO(String name) {
	this.name=name;
	}
public MobileDTO(String brand,String colour,int battery,String storage,int price) {
	this.brand=brand;
	this.colour= colour;
	this.battery=battery;
	this.storage=storage;
	this.price=price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public int getBattery() {
	return battery;
}
public void setBattery(int battery) {
	this.battery = battery;
}
public String getStorage() {
	return storage;
}
public void setStorage(String storage) {
	this.storage = storage;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}