package com.car_parts_assignment.car_parts.service;

import com.car_parts_assignment.car_parts.dao.PartsDAO;
import com.car_parts_assignment.car_parts.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartsServiceIMPL implements PartsService{

    private final PartsDAO partsDAO;

    @Autowired
    public PartsServiceIMPL(PartsDAO partsDAO) {
        this.partsDAO = partsDAO;
    }

    @Override
    public List<Part> findAll() {
        return partsDAO.findAll();
    }

    @Override
    public Object findById(int partId) {
        return  partsDAO.findById(partId);
    }

    @Override
    public void saveOrUpdate(Part thePart) {
        partsDAO.saveOrUpdate(thePart);
    }
    @Override
    public void deleteById(int partId) {
        partsDAO.deleteById(partId);
    }

}
