package com.Xworkz.pattern;

public class tria {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=2;j++) {
				if(j==0 || i==j || i+j==4 || i+5*j==7) {
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
