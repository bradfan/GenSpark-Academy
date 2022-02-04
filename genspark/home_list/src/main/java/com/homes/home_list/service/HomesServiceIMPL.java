package com.homes.home_list.service;


import com.homes.home_list.dao.HomesDAO;
import com.homes.home_list.entity.Homes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomesServiceIMPL implements HomesService{
    private final HomesDAO homesDao;

    @Autowired
    public HomesServiceIMPL(HomesDAO homesDao) {this.homesDao = homesDao; }

    @Override
    public List<Homes> findAll() {return homesDao.findAll();}

    @Override
    public Object findById(int homesId) {return homesDao.findById(homesId);}

    @Override
    public void saveOrUpdate(Homes theHomes) {homesDao.saveOrUpdate(theHomes);}

    @Override
    public void deleteById(int homesId) {homesDao.deleteById(homesId);}


}
