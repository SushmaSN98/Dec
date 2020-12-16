package com.xworkz.data;
import com.xworkz.data.car.ManagerDTO;
import com.xworkz.data.details.CarShowRoom;

public class CarShowRoomTester {
	public static void main(String[] args) {
		 
		CarShowRoom carShowRoom=new CarShowRoom();
		carShowRoom.addManager("george", 8764549345l);
		carShowRoom.displayManager();
		carShowRoom.removeManager();
		carShowRoom.displayManager();
		
       ManagerDTO dto=new ManagerDTO("Sushma" , 97315612789l);
        carShowRoom.addManager(dto);
		carShowRoom.displayManager();
		carShowRoom.updatedManager(8549840245l);
		carShowRoom.updatedManager("Sneha");
		carShowRoom.displayManager();
		
		carShowRoom.addManager(null);
		
		
		
		
	}

}
