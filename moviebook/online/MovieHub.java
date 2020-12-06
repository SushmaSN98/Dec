package com.Xworkz.moviebook.online;
import java.util.Arrays;

public class MovieHub {
	 private String theaterName;
	 private int numberOfTickets;
	 private String[] movieNames;
	 public MovieHub(String theaterName,int numberOfTickets,String[] movieNames)
	 {
		 System.out.println("invoked constuctor movieHub");
		 String movieNamesInArray=Arrays.toString(movieNames);
		 System.out.println("arg1"+theaterName);
		 System.out.println("arg2"+numberOfTickets);
		 System.out.println("arg3"+movieNames);
		 this.movieNames=movieNames;
		 this.theaterName=theaterName;
		 this.numberOfTickets=numberOfTickets;
		 System.out.println("*******************************");
		 
	 }
	 public double bookTickets(String nameOfMovie,int noOfTickets,String bookedBy)
	 {
		 double totalPrice=0;
		 System.out.println("invoked bookTickets");
		 System.out.println("name of the movie"+nameOfMovie);
		 System.out.println("no of tickets"+noOfTickets);
		 System.out.println("booked by"+bookedBy);
		 
		 for(int m=0;m<movieNames.length;m++)
			{
				String movie=movieNames[m];
				if(nameOfMovie.equals(movie))
				{
					System.out.println("movie found do booking ");
				}
				else {
					System.out.println("movies not found");
				}
				if(noOfTickets<=numberOfTickets) {
					System.out.println("number of tickets available "+numberOfTickets);
					numberOfTickets=numberOfTickets-noOfTickets;
					System.out.println("remaining tickets are: "+numberOfTickets);
					
				}
				else {
					System.out.println("there are no tickets");
				}
				}
		 return totalPrice;
		 
	 }
	public String getTheaterName() {
		return theaterName;
	}
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public String[] getMovieNames() {
		return movieNames;
	}
	 
}

