package com.Xworkz.copies;
 import com.Xworkz.copies.constructor.Vehicle;

public class VehicleTetser {
	public static void main(String[] args)
	{
		Vehicle vehicle=new Vehicle("Honda","3-JAN-2000","2KA");
		String company=vehicle.getCompany();
		String mfgdate=vehicle.getMfgDate();
		String chassis=vehicle.getChassisNo();
		
		System.out.println(company);
		System.out.println(mfgdate);
		System.out.println(chassis);
		
		String color="red";
		vehicle.setColor(color);
		
		String ownerName="SoichiroHonda";
		vehicle.setOwnerName(ownerName);
		
			
			
				

}
}
