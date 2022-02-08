package com.vehicles.vehicles.controller;

import com.vehicles.vehicles.entity.Vehicle;
import com.vehicles.vehicles.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {
    public final VehicleService vehicleService;

//    Constructor Injection
    @Autowired
    VehicleController(@Qualifier("vehicleServiceIMPL") VehicleService vehicleService) {this.vehicleService = vehicleService;}

    //   localhost:8080/retrieveAll
    @GetMapping("/retrieveAll")
    public List<Vehicle> findAll() {
        return vehicleService.findAll();
    }

    //   localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{vehicleId}")
    public Object findById(@PathVariable int vehicleId) {
        return vehicleService.findById(vehicleId);
    }

    //   localhost:8080/addVehicle
    @PostMapping("/addVehicle")
    public Vehicle addVehicle(@RequestBody Vehicle theVehicle) {
        theVehicle.setId(0);
        vehicleService.saveOrUpdate(theVehicle);
        return theVehicle;
    }

    //   localhost:8080/updateVehicle
    @PutMapping("/updateVehicle")
    public Vehicle updateVehicle(@RequestBody Vehicle updateVehicle) {
        vehicleService.saveOrUpdate(updateVehicle);
        return updateVehicle;
    }

    //    localhost:8080/deleteById/1
    @DeleteMapping("/deleteById/{vehicleId}")
    public String deleteById(@PathVariable int vehicleId) {
        vehicleService.deleteById(vehicleId);
        return "Deleted vehicle ID: " + vehicleId;
    }
}
