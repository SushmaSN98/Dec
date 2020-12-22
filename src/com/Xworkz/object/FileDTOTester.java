package com.Xworkz.object;
import com.Xworkz.object.dto.FileDTO;
import java.util.Date;

public class FileDTOTester {

	public static void main(String[] args) {
		
		FileDTO fileDto=new FileDTO();
		System.out.println(fileDto.getName());
		System.out.println(fileDto.getSize());
		System.out.println(fileDto.getType());
		System.out.println(fileDto.getCurrentDate());
		
		FileDTO fileDto1=new FileDTO("download.jpg", 217.12);
		System.out.println(fileDto1.getName());
		System.out.println(fileDto1.getSize());
		
		Date currentDate=new Date();
		FileDTO fileDto3=new FileDTO("voterID.jpg", "E://documents","jpg",40, currentDate);
		System.out.println(fileDto3.getName());
		System.out.println(fileDto3.getType());
		System.out.println(fileDto3.getLocation());
		System.out.println(fileDto3.getSize());
		System.out.println(fileDto3.getCurrentDate());
		
		
		fileDto.setLocation("E://documents");
		System.out.println(fileDto3.getLocation());
		fileDto.setType("Doc");	
		System.out.println(fileDto.getType());
		
		
		

	}

}
