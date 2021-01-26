package com.xworkz.license.dto;


import java.util.Date;


import com.xworkz.license.constants.Gender;
import com.xworkz.license.constants.BloodGroup;

public class CommonDTO {
	private String name;
	private int age;
	private Date DOB;
	private AddressDTO addressDTO;
	private long mobileNO;
	private Gender gender;
	private BloodGroup BloodGroup;
	
	public CommonDTO() {
		
	}

	public CommonDTO(String name, int age, Date dOB, AddressDTO addressDTO, long mobileNO, Gender gender,
			BloodGroup bloodGroup) {
		super();
		this.name = name;
		this.age = age;
		DOB = dOB;
		this.addressDTO = addressDTO;
		this.mobileNO = mobileNO;
		this.gender = gender;
		this.BloodGroup = bloodGroup;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public AddressDTO getAddressDTO() {
		return addressDTO;
	}

	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}

	public long getMobileNO() {
		return mobileNO;
	}

	public void setMobileNO(long mobileNO) {
		this.mobileNO = mobileNO;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public BloodGroup getBloodGroup() {
		return BloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		BloodGroup = bloodGroup;
	}
	
}
