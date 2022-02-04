package com.homes.home_list.service;

import com.homes.home_list.entity.Homes;

import java.util.List;

public interface HomesService {
    List<Homes> findAll();
    Object findById(int homesId);
    void saveOrUpdate(Homes theHomes);
    void deleteById(int HomesId);
}
