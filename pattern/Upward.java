package com.Xworkz.pattern;

public class Upward {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(i==0 || j==0 || i+j==4 || i+j==3 || i+j==2) {
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
