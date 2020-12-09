package com.Xworkz.moviebook;
import java.util.Iterator;
import com.Xworkz.moviebook.online.MovieHub;

public class SnackTester {

	public static void main(String[] args) {
		String[] movieNames = {"GentleMan","Villain","DearZindagi"};
		MovieHub movieHub=new MovieHub("PVR", 3, movieNames);
		double price=movieHub.buySnacks("Chips", 3, true, null);
		System.out.println("cost of snacks"+price);
		String[] snacks=movieHub.getSnacksList();
		for(int s=0;s<snacks.length;s++)
		{
			System.out.println(snacks[s]);
		}
		

	}

}
