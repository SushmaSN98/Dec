package com.Xworkz.pattern;

public class Downward {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				if(j==0 || i==4 || i==j || i>j) {
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
