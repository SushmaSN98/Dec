package com.xworkz.data.details;
 import com.xworkz.data.car.ManagerDTO;
 import com.xworkz.data.car.CarDTO;
 

public class CarShowRoom {
	private String name;
	private String place;
	private ManagerDTO managerDTO;
	private CarDTO[] cars = new CarDTO[3];
	private int currentIndex = 0;

	
	public CarShowRoom() {
		System.out.println("default carShowRoom constructor called");
	}
	
	public CarShowRoom(String name,String place) {
		super();
		this.name=name;
		this.place=place;
	
	}
	
	public void addManager(String name,long contactNo) {
		if(name!=null && contactNo>0) {
			this.managerDTO=new ManagerDTO(name,contactNo);
			System.out.println("manager added,details are valid");
			
		}
		else
		{
			System.out.println("details are not valid");
		}
	}
		public void addManager(ManagerDTO dto) {
			if(dto!=null) {
				this.managerDTO=dto;
				System.out.println("manager added");
			}
			else
			{
				System.out.println("manager not added,data is invalid");
			}
		}
		public void displayManager() {
			if(this.managerDTO!=null) {
				System.out.println(this.managerDTO.getName());
				System.out.println(this.managerDTO.getContactNo());
			} else {
				System.out.println("manager is not there :: null");
			}
		}
		public void removeManager() {
			this.managerDTO=null;
			System.out.println("manager removed");
			
		}
		 
		public void updatedManager(long contactNo) {
			
				this.managerDTO.setContactNo(contactNo);
				System.out.println("updated contactNo");
			}
		
		public void updatedManager(String name) {
		
			this.managerDTO.setName(name);
		System.out.println("updated name");
}
		public void addCars(CarDTO dto) {
			if (dto != null && this.currentIndex<5) {

				System.out.println("add cars");
				System.out.println("current index:" + this.currentIndex);
				this.cars[currentIndex] = dto;

				this.currentIndex++;

			} else {
				System.out.println("cars cannot be added");
				System.out.println("current index:" + this.currentIndex);
			}
		}

		

}
		
	


