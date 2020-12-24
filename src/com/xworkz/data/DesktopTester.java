package com.xworkz.data;
import com.xworkz.data.computer.Computer;
import com.xworkz.data.computer.Desktop;
import com.xworkz.data.computer.Laptop;

public class DesktopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop desktop=new Desktop();
		desktop.setCompanyName("Dell");
		System.out.println(desktop.getCompanyName());
		desktop.setSizeOfIcons("Medium");
		System.out.println(desktop.getSizeOfIcons());
		
		Laptop laptop=new Laptop();
		laptop.setCompanyName("HP");
		System.out.println(laptop.getCompanyName());
		laptop.setOS("Windows7");
		System.out.println(laptop.getOS());
		Computer computer=new Laptop();
		computer=new Desktop();
		
		if(computer instanceof Laptop) {
			System.out.println(" laptop is instance of computer");
			Laptop laptopComputer=(Laptop)computer;
		}
	    else {
			System.out.println(" laptop is not instance of computer");
		}
		
		

	}

}
