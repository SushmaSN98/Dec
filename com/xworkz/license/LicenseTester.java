package com.xworkz.license;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.xworkz.license.dto.AddressDTO;
import com.xworkz.license.constants.BloodGroup;
import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicalType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dao.imple.LicenseDAOImple;
import com.xworkz.license.dto.CommonDTO;
import com.xworkz.license.dto.LicenseDTO;


public class LicenseTester {

	public static void main(String[] args) {
		AddressDTO addressDTO = new AddressDTO(130,"NA","NA","Jamkandi","Karnataka",587121);
		
		Date dob=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("DD/MM/YYYY");
		try {
			dob=dateFormat.parse("12/10/1998");
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
		LicenseDTO dto=new LicenseDTO("Sushma",23,dob,addressDTO,9731221789l,Gender.FEMALE,BloodGroup.O_NEGATIVE);
		dto.setIdProof(IdProof.AADHAR);
		dto.setVehicalType(VehicalType.TWO_WHEELER);
		dto.setIdProofNo("7854 8787 6699");
		dto.setStartDate(new Date());
		dto.setDisability(false);
		
		LicenseDAO dao=new LicenseDAOImple();
		dao.save(dto);
		
		LicenseDTO dtoFound=dao.findByIdProofNo("7854 8787 6699");
		System.out.println("dto found");
		
		boolean updated=dao.updateVehicleTypeByIdProofNo("7854 8787 6699",VehicalType.TWO_WHEELER);
		System.out.println("updated"+updated);
		
		LicenseDTO dtoafterUpdate=dao.findByIdProofNo("7854 8787 6699");
		System.out.println("dtoAfterUpdate");
		
		boolean delete=dao.deleteByIdProofNo("7854 8787 6699");
		System.out.println("delete"+delete);
		
		LicenseDTO dtoFound1=dao.findByIdProofNo("7854 8787 6699");
		System.out.println(dtoFound1);
		
	}

}
