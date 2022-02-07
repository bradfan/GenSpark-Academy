package com.widget.trainingAPI.service;

import com.widget.trainingAPI.entity.Widget;

import java.util.List;

public interface WidgetService {
    List<Widget> findAll();
    Object findById(int widgetId);
    void saveOrUpdate(Widget theWidget);
    void deleteById(int widgetId);
}
