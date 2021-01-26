package com.xworkz.license.dao.imple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.license.constants.VehicalType;
import com.xworkz.license.dao.LicenseDAO;
import com.xworkz.license.dto.LicenseDTO;

public  class LicenseDAOImple implements LicenseDAO{
	private List <LicenseDTO> database;
	
	public LicenseDAOImple() {
		this.database=new ArrayList<LicenseDTO>();
	}
	@Override
	public void save(LicenseDTO dto) {
		System.out.println("invoke save to dao imp");
		System.out.println("to save dto"+dto);
		boolean saved=this.database.add(dto);
		if(saved) 
			System.out.println("dto is saved");
			else
			System.out.println("dto is not saved");
	}
	@Override
	public LicenseDTO findByIdProofNo(String idProofNo) {
		System.out.println("invoked findByIdProofNo");
		System.out.println("idProofNo:" + idProofNo);
		for (LicenseDTO licenseDTO : this.database) {
			String idProofFromDTO = licenseDTO.getIdProofNo();
			if (idProofFromDTO.equals(idProofNo)) {
				System.out.println("license found");
				return licenseDTO;
			}
		}
		return null;
	}
	@Override
	public boolean updateVehicleTypeByIdProofNo(String idProof, VehicalType type) {
		System.out.println("invoked updateVehicleTypeByIdProofNo");
		System.out.println("idProof:" + idProof);
		System.out.println("type:" + type);
		LicenseDTO dtoFromDB = this.findByIdProofNo(idProof);
		if (dtoFromDB != null) {
			System.out.println("can update , license is found");
			dtoFromDB.setVehicalType(type);
			return true;
		} else {
			System.out.println("cannot update , license not found");
		}
		return false;

	}

	@Override
	public boolean deleteByIdProofNo(String idPrrof) {
		System.out.println("invoked deleteByIdProofNo");
		System.out.println("idProof:"+idPrrof);
		LicenseDTO idProofFromDB=this.findByIdProofNo(idPrrof);
		Iterator<LicenseDTO> iterator=this.database.iterator();
		while(iterator.hasNext()) {
			LicenseDTO dto=iterator.next();
		if(dto.getIdProofNo().equals(idPrrof)) {
			System.out.println("idProof no deleted");
			return true;
		}
		else {
			System.out.println("idProof deleted");
		
				}
		}
		
		
		return false;
	
		
	}
	
	
}


