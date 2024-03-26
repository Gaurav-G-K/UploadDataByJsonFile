package com.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.data.dto.data;
import com.data.entity.Vehicle;
import com.data.repositry.VehicleRepo;
@Service
public class VehicleServicesImpl implements VehicleServices{

	@Autowired
	private VehicleRepo vehicleRepo;
	@Override
	public Vehicle addVehicle(Vehicle vehicle) {
		return vehicleRepo.save(vehicle);
	}

	@Override
	public Vehicle findVehicleById(long id) {
		Vehicle vehicle=vehicleRepo.findById(id).get();
		return vehicle;
	}

	@Override
	public Vehicle removeVehicleById(long id) {
		Vehicle vehicle=vehicleRepo.findById(id).get();
		vehicleRepo.delete(vehicle);
		return vehicle;
	}
	@Override
	public List<Vehicle> getAllVehicle() {
		return vehicleRepo.findAll();
	}
	
	@Override
	public data getProducrByPageWise(int pageNum, int limit){
		Pageable pageable=PageRequest.of(pageNum-1, limit);
		Page<Vehicle> page=vehicleRepo.findAll(pageable);
		data data=new data();
		data.setVehicles(page.getContent());
		data.setTotal_size(totalSize());
		return data;
	}
	
	public int totalSize() {
		return (int)vehicleRepo.count();
	}

}
