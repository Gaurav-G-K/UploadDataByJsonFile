package com.data.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.entity.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

}
