package com.songapi.apipractice.dao;


import com.songapi.apipractice.entity.Genre;


import java.util.List;

//DAO = Data Access Object
public interface GenreDao {
    List<Genre> findAllGenres();
    Object findByGenreId(int genreId);
    void saveOrUpdateGenre(Genre theGenre);
    void deleteByGenreId(int genreId);
}
