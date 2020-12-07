package com.Xworkz.pattern;

public class DownwardOpp {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i==4 || j==4 || i+j==4 || i+j==5 || i+j==6 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}


	


