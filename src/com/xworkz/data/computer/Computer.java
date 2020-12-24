package com.xworkz.data.computer;

public class Computer {
private	String companyName;
private String connectivity;
private String OS;

public void DisplayType() {
	System.out.println("invoked display type method");
}

public boolean wifiConnected(){
	System.out.println("ivoked wifi method");
	return true;
}

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getConnectivity() {
	return connectivity;
}

public void setConnectivity(String connectivity) {
	this.connectivity = connectivity;
}

public String getOS() {
	return OS;
}

public void setOS(String oS) {
	OS = oS;
}

	
}

