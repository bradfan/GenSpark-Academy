package com.car_parts_assignment.car_parts.dao;

import com.car_parts_assignment.car_parts.entity.Part;

import java.util.List;

public interface PartDAO {
    List<Part> findAll();
    Object findById(int theId);
    void saveOrUpdate(Part thePart);
    void deleteById(int theId);
}
