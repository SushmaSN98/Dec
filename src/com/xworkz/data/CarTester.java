package com.xworkz.data;
import com.xworkz.data.details.CarShowRoom;
import com.xworkz.data.car.CarDTO;
import com.xworkz.data.constants.CarVariant;

public class CarTester {

	public static void main(String[] args) {
		CarShowRoom car = new CarShowRoom();
		CarDTO dto=new CarDTO();
		dto.setModel("Audi");
		System.out.println(dto.getModel());
		dto.setPrice(30000000);
		System.out.println(dto.getPrice());
		dto.setVariant(CarVariant.TOP);
		System.out.println(dto.getVariant());
		
		CarShowRoom.addCar(dto);
		
		
		
		CarDTO dto1=new CarDTO("Maruthi 800",50000, CarVariant.BASE);
		CarShowRoom.addCar(dto1);
		
		
		

	}

}
