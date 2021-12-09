package com.example.listaContatos.model;

import javax.persistence.*;

@Entity
@Table(name = "Address")

public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String street;
	private Integer number;
	private String city;
	
	private Address() {
		super();
	}

	public Address(String street, Integer number, String city) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
}

