package com.widget.trainingAPI.dao;

import com.widget.trainingAPI.entity.Widget;

import java.util.List;

public interface WidgetDAO {
    List<Widget> findAll();
    Object findById(int widgetId);
    void saveOrUpdate(Widget theWidget);
    void deleteById(int widgetId);

}
