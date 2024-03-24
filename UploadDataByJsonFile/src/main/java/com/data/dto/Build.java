package com.data.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Build {
    private int year;
    private String vehicle_type;
    private String drivetrain;
    private int cylinders;
    private String body_subtype;
    private int doors;
    private String made_in;
    private String engine_block;
    private String trim;
    private String engine;
    private String body_type;
    private String model;
    private double engine_size;
    private String fuel_type;
    private String trim_r;
    private String make;
    private String transmission;
    private String tank_size;
    private String city_miles;
    private String highway_miles;
    private String std_seating;
    private String steering_type;
    private String antibrake_sys;
    private String overall_height;
    private String overall_length;
    private String overall_width;
    private String ref_miles_dt;
    private String opt_seating;
	public Build(int year, String vehicle_type, String drivetrain, int cylinders, String bodySubtype, int doors,
			String made_in, String engine_block, String trim, String engine, String body_type, String model,
			double engine_size, String fuel_type, String trim_r, String make, String transmission, String tankSize,
			String cityMiles, String highwayMiles, String stdSeating, String steeringType, String antibrakeSys,
			String overallHeight, String overallLength, String overallWidth, String refMilesDt, String opt_seating) {
		super();
		this.year = year;
		this.vehicle_type = vehicle_type;
		this.drivetrain = drivetrain;
		this.cylinders = cylinders;
		this.body_subtype = bodySubtype;
		this.doors = doors;
		this.made_in = made_in;
		this.engine_block = engine_block;
		this.trim = trim;
		this.engine = engine;
		this.body_type = body_type;
		this.model = model;
		this.engine_size = engine_size;
		this.fuel_type = fuel_type;
		this.trim_r = trim_r;
		this.make = make;
		this.transmission=transmission;
		this.tank_size=tankSize;
		this.city_miles=cityMiles;
		this.highway_miles=highwayMiles;
		this.std_seating=stdSeating;
		this.steering_type=steeringType;
		this.antibrake_sys=antibrakeSys;
		this.overall_height=overallHeight;
		this.overall_length=overallLength;
		this.overall_width=overallWidth;
		this.ref_miles_dt=refMilesDt;
		this.opt_seating=opt_seating;
	}
    
    
}

