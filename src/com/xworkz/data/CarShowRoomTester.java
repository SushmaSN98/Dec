package com.xworkz.data;
import com.xworkz.data.car.ManagerDTO;
import com.xworkz.data.car.CarShowRoom;

public class CarShowRoomTester {
	public static void main(String[] args) {
		 
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addManager("george", 8764549345l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		
       ManagerDTO managerDTO=new ManagerDTO("Sushma" , 9731221789l);
       carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		carShowRoom.updatedManager(8549840245l);
		carShowRoom.updatedManager("Sneha");
		carShowRoom.displayManager();
		
		
	}

}
