package com.xworkz.data;
import com.xworkz.data.computer.Computer;
import com.xworkz.data.computer.Desktop;
import com.xworkz.data.computer.Laptop;

public class ComputerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Desktop();
		Desktop desktop=(Desktop)computer;
		
		computer.setCompanyName("Lenovo");
		System.out.println(computer.getCompanyName());
		
		computer.setConnectivity("Wireless");
		System.out.println(computer.getConnectivity());
		
		computer.setOS("Windows10");
		System.out.println(computer.getOS());
		
		computer.DisplayType();
		computer.wifiConnected();
		
		Computer computer1=new Laptop();
		Laptop laptop=(Laptop)computer;
		laptop.setStorage(100);
		System.out.println(laptop.getStorage());
		laptop.shutDown();
		
		

	}

}
