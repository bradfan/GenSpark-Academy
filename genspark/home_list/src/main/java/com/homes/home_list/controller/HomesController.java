package com.homes.home_list.controller;

import com.homes.home_list.entity.Homes;
import com.homes.home_list.service.HomesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomesController {
     public final HomesService homesService;

//    Constructor injection
@Autowired
HomesController(@Qualifier("homesServiceIMPL") HomesService homesService) {this.homesService = homesService;}

    //   localhost:8080/retrieveAll
    @GetMapping("/retrieveAll")
    public List<Homes> findAll() {
        return homesService.findAll();
    }

    //   localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{homesId}")
    public Object findById(@PathVariable int homesId) {
        return homesService.findById(homesId);
    }

    //   localhost:8080/addHome
    @PostMapping("/addHome")
    public Homes addHome(@RequestBody Homes theHomes) {
        theHomes.setId(0);
        homesService.saveOrUpdate(theHomes);
        return theHomes;
    }

    //   localhost:8080/updateHome
    @PutMapping("/updateHome")
    public Homes updateHome(@RequestBody Homes updateHome) {
        homesService.saveOrUpdate(updateHome);
        return updateHome;
    }

    //    localhost:8080/deleteById/1
    @DeleteMapping("/deleteById/{homesId}")
    public String deleteById(@PathVariable int homesId) {
        homesService.deleteById(homesId);
        return "Deleted genre ID: " + homesId;
    }
}
