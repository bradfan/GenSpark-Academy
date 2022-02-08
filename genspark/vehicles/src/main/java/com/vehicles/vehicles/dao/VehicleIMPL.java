package com.vehicles.vehicles.dao;

import com.vehicles.vehicles.entity.Vehicle;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class VehicleIMPL implements VehicleDAO {
    private final EntityManager entityManager;

    @Autowired
    @Autowired
    public VehicleIMPL(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<Vehicle> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Vehicle> myQuery = currentSession.createQuery("from Vehicle");
        return myQuery.getResultList();
    }
    @Override
    @Transactional
    public Vehicle findById(int vehicleId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Vehicle.class, vehicleId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Vehicle theVehicle) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theVehicle);
    }

    @Override
    @Transactional
    public void deleteById(int vehicleId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Vehicle myVehicle = currentSession.get(Vehicle.class, vehicleId);
        currentSession.delete(myVehicle);
    }
}
