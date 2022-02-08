package com.vehicles.vehicles.service;

import com.vehicles.vehicles.entity.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> findAll();
    Object findById(int vehicleId);
    void saveOrUpdate(Vehicle theVehicle);
    void deleteById(int vehicleId);
}
