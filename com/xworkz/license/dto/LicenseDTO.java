package com.xworkz.license.dto;
import java.util.Date;

import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.IdProof;
import com.xworkz.license.constants.VehicalType;
import com.xworkz.license.constants.BloodGroup;

public class LicenseDTO extends CommonDTO {
	private IdProof idProof;
	private VehicalType vehicalType;
     private String	idProofNo;
     private Date startDate;
     private boolean disability;
     
     public LicenseDTO() {
    	 super();
     }

	public LicenseDTO(String name, int age, Date dOB, AddressDTO addressDTO, long mobileNO, Gender gender,
			BloodGroup bloodGroup) {
		super(name, age, dOB, addressDTO, mobileNO, gender, bloodGroup);
	}
     
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			System.out.println("object is null");
		return false;
		}
	
	if(obj instanceof LicenseDTO) {
		LicenseDTO converted= (LicenseDTO)obj;
		if(this.idProofNo !=null && this.idProofNo.contentEquals(converted.getIdProofNo())) {
			return true;
		
		}
	}
	
	return false;
	}

	@Override
	public String toString() {
		return "LicenseDTO [idProof=" + idProof + ", vehicalType=" + vehicalType + ", idProofNo=" + idProofNo
				+ ", startDate=" + startDate + ", disability=" + disability + "]";
	}

	public IdProof getIdProof() {
		return idProof;
	}

	public void setIdProof(IdProof idProof) {
		this.idProof = idProof;
	}

	public VehicalType getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(VehicalType vehicalType) {
		this.vehicalType = vehicalType;
	}

	public String getIdProofNo() {
		return idProofNo;
	}

	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public boolean isDisability() {
		return disability;
	}

	public void setDisability(boolean disability) {
		this.disability = disability;
	}

	public void save(LicenseDTO dto) {
		
		
	}
	
	
}
		
     


