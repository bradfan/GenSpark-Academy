package com.songapi.apipractice.service;

import com.songapi.apipractice.dao.GenreDao;
import com.songapi.apipractice.entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreServiceIMPL implements GenreService{

    private final GenreDao genreDao;

    @Autowired
    public GenreServiceIMPL(GenreDao genreDao) {this.genreDao = genreDao; }

    @Override
    public List<Genre> findAllGenre() {return genreDao.findAllGenres();}

    @Override
    public Object findByGenreId(int genreId) {return genreDao.findByGenreId(genreId);}

    @Override
    public void saveOrUpdateGenre(Genre theGenre) {
        genreDao.saveOrUpdateGenre(theGenre);}

    @Override
    public void deleteByGenreId(int genreId) {
        genreDao.deleteByGenreId(genreId);}

}
