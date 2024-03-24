package com.data.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.data.dto.DataEntry;
import com.data.dto.Vehicles;
import com.data.entity.Files;
import com.data.entity.Vehicle;
import com.data.repositry.FilesRepo;
@Service
public class fileServicesImpl implements fileServices{
	
	@Autowired
	private FilesRepo filesRepo;
	@Autowired
	
	private VehicleServices vehicleServices;
	@Override
	public List<Vehicles> UploadFile(MultipartFile file) throws IOException {
		ObjectMapper obj=new ObjectMapper();
		DataEntry datafetch=obj.readValue(file.getInputStream(), DataEntry.class);
		List<Vehicles> raw=datafetch.getListings();
		for(int i=0;i<raw.size();i++) {
			Vehicle vehicle=getVehicleDetails(raw.get(i));
			vehicleServices.addVehicle(vehicle);
		}
		Files files = new Files();
        files.setFileName(file.getOriginalFilename());
        files.setFileType(file.getContentType());
        files.setFileData(file.getBytes());
        Files uploded=filesRepo.save(files);
		return datafetch.getListings();
	}

	@Override
	public Files getFile(Long id) {
		Files files=filesRepo.findById(id).get();
		return files;
	}
	
	public Vehicle getVehicleDetails(Vehicles raw){
		Vehicle vehicle=new Vehicle();
		vehicle.setYear(raw.getBuild().getYear());
		vehicle.setVehicle_type(raw.getBuild().getVehicle_type());
		vehicle.setDrivetrain(raw.getBuild().getDrivetrain());
		vehicle.setCylinders(raw.getBuild().getCylinders());
		vehicle.setBody_subtype(raw.getBuild().getBody_subtype());
		vehicle.setDoors(raw.getBuild().getDoors());
		vehicle.setMade_in(raw.getBuild().getMade_in());
		vehicle.setTrim(raw.getBuild().getTrim());
		vehicle.setEngine(raw.getBuild().getEngine());
		vehicle.setModel(raw.getBuild().getModel());
		vehicle.setEngine_size(raw.getBuild().getEngine_size());
		vehicle.setFuel_type(raw.getBuild().getFuel_type());
		vehicle.setTrim_r(raw.getBuild().getTrim_r());
		vehicle.setMake(raw.getBuild().getMake());
		vehicle.setPrice(raw.getPrice());
		vehicle.setSeller_type(raw.getSeller_type());
		vehicle.setSource(raw.getSource());
		vehicle.setInterior_color(raw.getInterior_color());
		vehicle.setExterior_color(raw.getExterior_color());
		vehicle.setVin(raw.getVin());
		return vehicle;
	}
}
//private String vin;