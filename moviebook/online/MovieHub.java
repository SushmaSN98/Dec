package com.Xworkz.moviebook.online;
import java.util.Arrays;

public class MovieHub {
	 private String theaterName;
	 private int numberOfTickets;
	 private String[] movieNames;
	 private double ticketPrice = 100;
	private String[] snacksList = { "Pop Corn", "Chips", "Cool Drinks", "Samosa", "Nachos", "Fryms" };
	private double snackPrice=50;
	private int totalSnacks=1500;
		
	 public MovieHub(String theaterName,int numberOfTickets,String[] movieNames)
	 {
		 System.out.println("invoked constuctor movieHub");
		 String movieNamesInArray=Arrays.toString(movieNames);
		 System.out.println("arg1"+theaterName);
		 System.out.println("arg2"+numberOfTickets);
		 System.out.println("arg3"+Arrays.toString(movieNames));
		 this.movieNames=movieNames;
		 this.theaterName=theaterName;
		 this.numberOfTickets=numberOfTickets;
		 System.out.println("*******************************");
		 
	 }
	 /**
		 * This method will check movie exists in theater and return total price
		 * 
		 * @param movieName
		 * @param noOfTickets
		 * @param bookedBy
		 * @return totalPrice
		 */
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
	 public double buySnacks(String nameOfSnack, int quantity, boolean selfService, String seatNo) {
			double totalPrice = 0;

			System.out.println("invoked buySnacks");
			System.out.println("arg 1 " + nameOfSnack);
			System.out.println("arg 2 " + quantity);
			System.out.println("arg 3 " + selfService);
			System.out.println("arg 4 " + seatNo);
			
			for(int s=0;s<this.snacksList.length;s++)
			{
				System.out.println("snack"+this.snacksList[s]);
				String snack=this.snacksList[s];
				if(snack.equals(nameOfSnack))
				{
					System.out.println("snack is available ");
					if(quantity<=this.totalSnacks)
					{
						System.out.println("snacks quantity available");
						this.totalSnacks=this.totalSnacks-quantity;
						System.out.println("total snacks remaining "+this.totalSnacks);
						totalPrice=quantity*this.snackPrice;
						System.out.println("total price of snack"+totalPrice);
					}
					else {
						System.out.println("snacks quantity not available");
					}
					break;
				}
				else {
					System.out.println("snack is not available");
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
	public String[] getSnacksList() {
		return snacksList;
	}
	 
}

