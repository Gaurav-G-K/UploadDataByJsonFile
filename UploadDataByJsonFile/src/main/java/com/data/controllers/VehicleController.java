package com.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.entity.Vehicle;
import com.data.services.VehicleServices;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleServices vehicleServices;
	
	@PostMapping
	public ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle vehicle) {
		return new ResponseEntity<Vehicle>(vehicleServices.addVehicle(vehicle),HttpStatus.CREATED);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Vehicle> findVehicleById(@PathVariable long id) {
		return new ResponseEntity<Vehicle>(vehicleServices.findVehicleById(id),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Vehicle> RemoveVehicleById(@PathVariable long id) {
		return new ResponseEntity<Vehicle>(vehicleServices.removeVehicleById(id),HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<List<Vehicle>> getAllVehicle(){
		return new ResponseEntity<List<Vehicle>>(vehicleServices.getAllVehicle(),HttpStatus.OK);
		
	}
}
