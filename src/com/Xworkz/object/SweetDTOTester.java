package com.Xworkz.object;
import java.util.Arrays;

import com.Xworkz.object.dto.SweetDTO;

public class SweetDTOTester {

	public static void main(String[] args) {
		SweetDTO sweetDto=new SweetDTO("Kaju barfi",700);
		System.out.println(sweetDto.getName());
		System.out.println(sweetDto.getPrice());
		
		
		String[] color=new String[2];
		color[0]="cream";
		color[1]="white";
		
		SweetDTO sweetDto2=new SweetDTO("Karnataka", color,"1KG");
		System.out.println(sweetDto2.getPopularState());
		System.out.println(sweetDto2.getQuantity());
		System.out.println(Arrays.toString(sweetDto2.getColor()));
		
		
	
		System.out.println(sweetDto.getShape());
		

	}

}
