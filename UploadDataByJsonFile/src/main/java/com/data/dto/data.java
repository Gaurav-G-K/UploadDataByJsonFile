package com.data.dto;

import java.util.List;

import com.data.entity.Vehicle;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class data {
	
	private List<Vehicle> vehicles;
	
	int total_size;

	public data(List<Vehicle> vehicles, int total_size) {
		super();
		this.vehicles = vehicles;
		this.total_size = total_size;
	}
	

}
