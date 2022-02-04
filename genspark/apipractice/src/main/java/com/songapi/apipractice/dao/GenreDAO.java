package com.songapi.apipractice.dao;


import com.songapi.apipractice.entity.Genre;


import java.util.List;

//DAO = Data Access Object
public interface GenreDAO {
    List<Genre> findAll();
    Object findById(int genreId);
    void saveOrUpdate(Genre theGenre);
    void deleteById(int genreId);
}
