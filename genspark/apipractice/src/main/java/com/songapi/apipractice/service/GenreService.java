package com.songapi.apipractice.service;

import com.songapi.apipractice.entity.Genre;
import com.songapi.apipractice.entity.Song;

import java.util.List;

public interface GenreService {
    List<Genre> findAll();
    Object findById(int genreID);
    void saveOrUpdate(Genre theGenre);
    void deleteById(int genreId);
}
