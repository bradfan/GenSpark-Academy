package com.songapi.apipractice.service;

import com.songapi.apipractice.entity.Genre;
import com.songapi.apipractice.entity.Song;

import java.util.List;

public interface GenreService {
    List<Genre> findAllGenre();
    Object findByGenreId(int genreID);
    void saveOrUpdateGenre(Genre theGenre);
    void deleteByGenreId(int genreId);
}
