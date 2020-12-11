package com.Xworkz.object;
import com.Xworkz.object.dto.CountryDTO;
import java.util.Arrays;

public class CountryDTOTester {
	public static void main(String[] args) {
		
		CountryDTO countryDto=new CountryDTO("INDIA");
		System.out.println(countryDto.getName());
		
		CountryDTO countryDto2=new CountryDTO("INDIA",1380004385);
		System.out.println(countryDto2.getName());
		System.out.println(countryDto2.getPopulation());
		
		CountryDTO countryDto3=new CountryDTO(1380004385,"Narendra Modi","Pranab Mukarji");
		System.out.println(countryDto3.getPopulation());
		System.out.println(countryDto3.getPrimeMinister());
		System.out.println(countryDto3.getPresident());
		
		String[] States=new String[5];
		States[0]="Karnataka";
		States[1]="Kerala";
		States[2]="Punjab";
		States[3]="Rajastan";
		States[4]="Maharashtra";
		
		String[] languages=new String[15];
        languages[0]="Kannada";
        languages[1]="Hindi";
        languages[2]="Telugu";
        languages[3]="Tamil";
        languages[4]="Urdu";
        languages[5]="Marati";
        languages[6]="Nepali";
        languages[7]="Kashmiri";
        languages[8]="Malayalam";
        languages[9]="Bengali";
        languages[10]="Sanskrit";
        languages[11]="Gujarathi";
        languages[12]="Manipuri";
        languages[13]="Oriya";
        languages[14]="Maithili";
        
        CountryDTO countryDto4=new CountryDTO( States, languages);
        System.out.println(Arrays.toString(countryDto4.getStates()));
        System.out.println(Arrays.toString(countryDto4.getLanguages()));
        }

}
