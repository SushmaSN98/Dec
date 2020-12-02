package com.Xworkz.copies.constructor;

public class Paper {
	private String brand="ClassMate";
	private float width;
	private float height;
	public String colour;
	public Paper(float width,float height,String colour)
	{
		this.brand=brand;
		this.width=width;
		this.height=height;
		this.colour=colour;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getBrand() {
		return brand;
	}
	public String getColour() {
		return colour;
	}
	

}
