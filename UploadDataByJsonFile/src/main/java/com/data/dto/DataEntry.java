package com.data.dto;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataEntry {
	
	private List<Vehicles> listings;
	
	private long num_found;
	
	public DataEntry(List<Vehicles> vehicles, long num_found) {
		super();
		this.listings = vehicles;
		this.num_found = num_found;
	}
}
