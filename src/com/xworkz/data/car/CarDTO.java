package com.xworkz.data.car;
import com.xworkz.data.constants.CarVariant;


public class CarDTO {
	private String model;
	 private double price;
	 private CarVariant variant;
	 
	 public CarDTO() {
		 System.out.println("cardto constructor");
	 }
	 
	 public CarDTO(String model,double price,CarVariant Variant) {
		 this.model=model;
		 this.price=price;
		 this.variant=variant;
	 }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CarVariant getVariant() {
		return variant;
	}

	public void setVariant(CarVariant variant) {
		this.variant = variant;
	}
	 
	 

}
