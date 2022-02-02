package com.car_parts_assignment.car_parts.service;

import com.car_parts_assignment.car_parts.entity.Part;

import java.util.List;

public interface PartsService {
     List<Part> findAll();
     Object findById(int partId);
     void saveOrUpdate(Part thePart);
     void deleteById(int partId);
//args defined in PartIMPL
}
