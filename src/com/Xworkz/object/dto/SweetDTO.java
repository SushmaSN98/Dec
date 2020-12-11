package com.Xworkz.object.dto;

enum Shape{
	ROUND,SQUARE,DIAMOND,RECTANGLE,LOZENGE
}

public class SweetDTO {
	private String name;
	private int price;
	private String popularState;
	 private String[] color;
	private Shape shape;
	private String quantity;
	
	public SweetDTO(String name,int price) {
		this.name=name;
		this.price=price;
	}
	Shape s1=Shape.LOZENGE;
	public SweetDTO(String popularState,String[] color,String quantity) {
		this.popularState=popularState;
		this.color=color;
		//this.shape=shape;
		this.quantity=quantity;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPopularState() {
		return popularState;
	}
	public void setPopularState(String popularState) {
		this.popularState = popularState;
	}
	public String[] getColor() {
		return color;
	}
	public void setColor(String[] color) {
		this.color = color;
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
