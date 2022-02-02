package com.car_parts_assignment.car_parts.controller;


import com.car_parts_assignment.car_parts.entity.Part;
import com.car_parts_assignment.car_parts.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartsController {

    private final PartsService partsService;

//    An example of Constructor Injection
    @Autowired
    public PartsController(@Qualifier("partsServiceIMPL") PartsService partsService) {
        this.partsService = partsService;
    }

    //http://localhost:8080/retrieveAllParts
    @GetMapping("/retrieveAllParts")
    public List<Part> findAll() {
        return partsService.findAll();
    }

    //http://localhost:8080/addPart
    @PostMapping("/addPart")
    public Part addPart(@RequestBody Part thePart) {
        thePart.setId(0);
        partsService.saveOrUpdate(thePart);
        return thePart;
    }

    //http://localhost:8080/updatePart
    @PutMapping("/updatePart")
    public Part updatePart(@RequestBody Part updatePart) {
        partsService.saveOrUpdate(updatePart);
        return updatePart;
    }

    //http://localhost:8080/deletePart/1
    @DeleteMapping("/deleteEmployee/{partId}")
    public String deletePart(@PathVariable int partId) {
        partsService.deleteById(partId);
        return "Deleted part ID: " + partId;
    }

}
