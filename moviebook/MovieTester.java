package com.Xworkz.moviebook;
import com.Xworkz.moviebook.online.MovieHub;

import java.util.Arrays;


public class MovieTester {
	public static void main(String[] args)
			{
		String[] movieNames= {"GentleMan","Villain","DearZindagi"};
		MovieHub movieHub=new MovieHub("Shakti",300,movieNames);
		String movieNamesInArray=Arrays.toString(movieHub.getMovieNames());
		System.out.println("theater name:"+movieHub.getTheaterName());
		System.out.println("number of tickets:"+movieHub.getNumberOfTickets());
		System.out.println(movieNamesInArray);
		
		movieHub.bookTickets("GentleMan",6,"Sushma");
		
		movieHub.bookTickets("DearZindagi", 10, "Sneha");
		
		
		
			}

}
