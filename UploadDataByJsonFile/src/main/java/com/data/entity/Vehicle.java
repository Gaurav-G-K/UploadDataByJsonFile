package com.data.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int year;
    private String vehicle_type;
    private String drivetrain;
    private int cylinders;
    private String body_subtype;
    private int doors;
    private String made_in;
    private String trim;
    private String engine;
    private String model;
    private double engine_size;
    private String fuel_type;
    private String trim_r;
    private String make;
    private long price;
    private String seller_type;
    private String source;
    private String interior_color;
    private String exterior_color;
    private String vin;
	public Vehicle(int year, String vehicle_type, String drivetrain, int cylinders, String body_subtype, int doors,
			String made_in, String trim, String engine, String model, double engine_size, String fuel_type,
			String trim_r, String make, long price, String seller_type, String source, String interior_color,
			String exterior_color, String vin) {
		super();
		this.year = year;
		this.vehicle_type = vehicle_type;
		this.drivetrain = drivetrain;
		this.cylinders = cylinders;
		this.body_subtype = body_subtype;
		this.doors = doors;
		this.made_in = made_in;
		this.trim = trim;
		this.engine = engine;
		this.model = model;
		this.engine_size = engine_size;
		this.fuel_type = fuel_type;
		this.trim_r = trim_r;
		this.make = make;
		this.price = price;
		this.seller_type = seller_type;
		this.source = source;
		this.interior_color = interior_color;
		this.exterior_color = exterior_color;
		this.vin = vin;
	}
    
    
}
