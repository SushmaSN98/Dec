package com.Xworkz.pattern;

public class TriaOpp {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(j==4 || i*4+j==7 || i*4+j==10 || i*5-j==12 || i*7-j==11 ) {
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
