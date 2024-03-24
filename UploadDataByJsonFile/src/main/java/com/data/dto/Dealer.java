package com.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dealer {

    private String zip;
    private String country;
    private String website;
    private String city;
    private String phone;
    private String street;
    private String latitude;
    private String name;
    private long id;
    private String dealer_type;
    private String state;
    private String longitude;
	public Dealer(String zip, String country, String website, String city, String phone, String street, String latitude,
			String name, long id, String dealer_type, String state, String longitude) {
		super();
		this.zip = zip;
		this.country = country;
		this.website = website;
		this.city = city;
		this.phone = phone;
		this.street = street;
		this.latitude = latitude;
		this.name = name;
		this.id = id;
		this.dealer_type = dealer_type;
		this.state = state;
		this.longitude = longitude;
	}
    
}
