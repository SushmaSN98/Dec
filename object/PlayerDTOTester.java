package com.Xworkz.object;
import com.Xworkz.object.DTO.PlayerDTO;
import java.util.Arrays;

public class PlayerDTOTester {

	public static void main(String[] args) {
		PlayerDTO playerDTO=new PlayerDTO();
		playerDTO.setName("Lizzie Amritstead");
		playerDTO.setCountry("UK");
		System.out.println(playerDTO.getName());
		System.out.println(playerDTO.getCountry());
		
		String[] sports=new String[2];
		sports[0]=new String("Cycling");
		sports[1]=new String("raod race");
		playerDTO.setSports(sports);
		System.out.println("array of sports:"+Arrays.toString(sports));
		 
		String[] awards=new String[2];
		awards[0]=new String("UCI Raod World Cup");
		awards[1]=new String("commonwealth");
		playerDTO.setAwards(awards);
		System.out.println("array of awards:"+Arrays.toString(awards));	
		
		System.out.println("*************");
		
		PlayerDTO playerDTO2=new PlayerDTO();
		playerDTO2.setName("Ms Deepika");
		playerDTO2.setCountry("India");
		System.out.println(playerDTO2.getName());
		System.out.println(playerDTO2.getCountry());
		
		String[] sports2=new String[2];
		sports2[0]=new String("Hockey");
		sports2[1]=new String("Hockey");
		playerDTO.setSports(sports2);
		System.out.println("array of sports:"+Arrays.toString(sports2));
		
		String[] awards2=new String[2];
		awards2[0]=new String("Arjun award");
		awards2[1]=new String("field hockey medal");
		playerDTO.setAwards(awards2);
		System.out.println("array of awards:"+Arrays.toString(awards2));
		
		System.out.println("*************");
		
		PlayerDTO playerDTO3=new PlayerDTO();
		playerDTO3.setName("Leander paes");
		playerDTO3.setCountry("India");
		System.out.println(playerDTO3.getName());
		System.out.println(playerDTO3.getCountry());
		
		String[] sports3=new String[1];
		sports3[0]=new String("Tennis");
		
		playerDTO.setSports(sports3);
		System.out.println("array of sports:"+Arrays.toString(sports3));
		
		String[] awards3=new String[2];
		awards3[0]=new String("RAjiv Gandi Khel Ratna");
		awards3[1]=new String("Arjun award");
		playerDTO.setAwards(awards3);
		System.out.println("array of awards:"+Arrays.toString(awards3));
		
		System.out.println("*************");
		
		PlayerDTO playerDTO4=new PlayerDTO();
		playerDTO4.setName("MS Dhoni");
		playerDTO4.setCountry("India");
		System.out.println(playerDTO4.getName());
		System.out.println(playerDTO4.getCountry());
		
		String[] sports4=new String[1];
		sports4[0]=new String("Cricket");
		
		playerDTO.setSports(sports4);
		System.out.println("array of sports:"+Arrays.toString(sports4));
		
		String[] awards4=new String[3];
		awards4[0]=new String("RAjiv Gandi Khel Ratna");
		awards4[1]=new String("Padma shri");
		awards4[2]=new String("ICC ODI Player of the year");
		playerDTO.setAwards(awards4);
		System.out.println("array of awards:"+Arrays.toString(awards4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
