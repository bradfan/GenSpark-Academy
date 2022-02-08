package com.vehicles.vehicles.dao;

import com.vehicles.vehicles.entity.Vehicle;

import java.util.List;

// DAO = Data Access Object
public interface VehicleDAO {
    List<Vehicle> findAll();
    Object findById(int vehicleId);
    void saveOrUpdate(Vehicle theVehicle);
    void deleteById(int vehicleId);
}
