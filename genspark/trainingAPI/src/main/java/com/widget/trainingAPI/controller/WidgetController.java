package com.widget.trainingAPI.controller;

import com.widget.trainingAPI.entity.Widget;
import com.widget.trainingAPI.service.WidgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WidgetController {
    public final WidgetService widgetService;


//    Constructor Injection
    @Autowired
    WidgetController(@Qualifier("widgetServiceIMPL") WidgetService widgetService) {this.widgetService = widgetService;}

//   localhost:8080/retrieveAll
    @GetMapping("/retriveAll")
    public List<Widget> findAll() {
        return widgetService.findAll();
    }

    //   localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{widgetId}")
    public Object findById(@PathVariable int widgetId) {
        return widgetService.findById(widgetId);
    }

    //   localhost:8080/addWidget
    @PostMapping("/addWidget")
    public Widget addWidget(@RequestBody Widget theWidget) {
        theWidget.setId(0);
        widgetService.saveOrUpdate(theWidget);
        return theWidget;
    }

    //   localhost:8080/updateWidget
    @PutMapping("/updateWidget")
    public Widget updateWidget(@RequestBody Widget updateWidget) {
        widgetService.saveOrUpdate(updateWidget);
        return updateWidget;
    }

    //    localhost:8080/deleteById/1
    @DeleteMapping("/deleteById/{widgetId}")
    public String deleteById(@PathVariable int widgetId) {
        widgetService.deleteById(widgetId);
        return "Deleted widget ID: " + widgetId;
    }
    
}
