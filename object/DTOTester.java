package com.Xworkz.object;
import com.Xworkz.object.DTO.CustomerDTO;

public class DTOTester {

	public static void main(String[] args) {
		CustomerDTO customerDTO=new CustomerDTO();
		customerDTO.setName("sushma");
        customerDTO.setCustomerId(56);
        customerDTO.setContactNo(9731221789l);
        customerDTO.setEmail("shshmasn@gmail.com");
        System.out.println(customerDTO.getName());
		System.out.println(customerDTO.getCustomerId());
		System.out.println(customerDTO.getContactNo());
		System.out.println(customerDTO.getEmail());
		
		CustomerDTO customerDTO2=new CustomerDTO();
		customerDTO2.setName("sonal");
        customerDTO2.setCustomerId(3675);
        customerDTO2.setContactNo(8549840547l);
        customerDTO2.setEmail("sonal@gmail.com");
        System.out.println(customerDTO2.getName());
		System.out.println(customerDTO2.getCustomerId());
		System.out.println(customerDTO2.getContactNo());
		System.out.println(customerDTO2.getEmail());
		
		CustomerDTO customerDTO3=new CustomerDTO();
		customerDTO3.setName("george");
        customerDTO3.setCustomerId(1028);
        customerDTO3.setContactNo(9875447823l);
        customerDTO3.setEmail("george@gmail.com");
        System.out.println(customerDTO3.getName());
		System.out.println(customerDTO3.getCustomerId());
		System.out.println(customerDTO3.getContactNo());
		System.out.println(customerDTO3.getEmail());
		
		
		
		

	}

}
