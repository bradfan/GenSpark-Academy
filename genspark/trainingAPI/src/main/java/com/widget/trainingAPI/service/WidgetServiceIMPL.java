package com.widget.trainingAPI.service;

import com.widget.trainingAPI.dao.WidgetDAO;
import com.widget.trainingAPI.entity.Widget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WidgetServiceIMPL implements WidgetService{
    private final WidgetDAO widgetDAO;

    @Autowired
    public WidgetServiceIMPL(WidgetDAO widgetDAO) {this.widgetDAO = widgetDAO;}

    @Override
    public List<Widget> findAll() {return widgetDAO.findAll();}

    @Override
    public Object findById(int widgetId) {return widgetDAO.findById(widgetId);}

    @Override
    public void saveOrUpdate(Widget theWidget) {widgetDAO.saveOrUpdate(theWidget);}

    @Override
    public void deleteById(int widgetId) {widgetDAO.deleteById(widgetId);}

}
