package com.vehicles.vehicles.service;

import com.vehicles.vehicles.dao.VehicleDAO;
import com.vehicles.vehicles.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceIMPL implements VehicleService{
    private final VehicleDAO vehicleDAO;

    @Autowired
    public VehicleServiceIMPL(VehicleDAO vehicleDAO) {this.vehicleDAO  =vehicleDAO;}

    @Override
    public List<Vehicle> findAll() {return vehicleDAO.findAll();}

    @Override
    public Object findById(int vehicleId) {return vehicleDAO.findById(vehicleId);}

    @Override
    public void saveOrUpdate(Vehicle theVehicle) {vehicleDAO.saveOrUpdate(theVehicle);}

    @Override
    public void deleteById(int vehicleId) {vehicleDAO.deleteById(vehicleId);}

}
