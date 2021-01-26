package com.xworkz.license.dao;

import com.xworkz.license.dto.LicenseDTO;
import com.xworkz.license.constants.VehicalType;

public interface LicenseDAO {
	void save (LicenseDTO dto);
	LicenseDTO findByIdProofNo(String idProofNo);
	boolean updateVehicleTypeByIdProofNo(String idProof,VehicalType type);
	boolean deleteByIdProofNo(String idProof);



}

