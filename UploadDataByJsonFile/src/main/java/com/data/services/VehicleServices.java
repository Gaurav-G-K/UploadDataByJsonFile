package com.data.services;

import java.util.List;

import com.data.entity.Vehicle;

public interface VehicleServices {

	public Vehicle addVehicle(Vehicle vehicle);
	
	public Vehicle findVehicleById(long id);
	
	public Vehicle removeVehicleById(long id);
	
	public List<Vehicle> getAllVehicle();
}
