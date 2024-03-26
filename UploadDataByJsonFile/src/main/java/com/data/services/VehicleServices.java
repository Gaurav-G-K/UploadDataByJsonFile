package com.data.services;

import java.util.List;

import com.data.dto.data;
import com.data.entity.Vehicle;

public interface VehicleServices {

	public Vehicle addVehicle(Vehicle vehicle);
	
	public Vehicle findVehicleById(long id);
	
	public Vehicle removeVehicleById(long id);
	
	public List<Vehicle> getAllVehicle();
	
	public data getProducrByPageWise(int pageNum, int limit);
	
	public int totalSize();
}
