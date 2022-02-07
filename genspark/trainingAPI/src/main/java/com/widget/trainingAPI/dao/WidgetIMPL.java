package com.widget.trainingAPI.dao;

import com.widget.trainingAPI.entity.Widget;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class WidgetIMPL implements WidgetDAO{
    private final EntityManager entityManager;

    @Autowired
    public WidgetIMPL(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<Widget> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Widget> myQuery = currentSession.createQuery("from Widget");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Widget findById(int widgetId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Widget.class, widgetId);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Widget theWidget) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theWidget);
    }

    @Override
    @Transactional
    public void deleteById(int widgetId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Widget myWidget = currentSession.get(Widget.class, widgetId);
        currentSession.delete(myWidget);
    }

}
