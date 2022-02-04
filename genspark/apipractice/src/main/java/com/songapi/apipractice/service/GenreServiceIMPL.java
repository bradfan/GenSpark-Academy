package com.songapi.apipractice.service;

import com.songapi.apipractice.dao.GenreDao;
import com.songapi.apipractice.entity.Genre;
import com.songapi.apipractice.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GenreServiceIMPL implements GenreService{

    private final GenreDao genreDao;

    @Autowired
    public GenreServiceIMPL(GenreDao songDao) {this.genreDao = genreDao; }

    @Override
    public List<Genre> findAll() {return genreDao.findAll();}

    @Override
    public Object findById(int songId) {return genreDao.findById(genreId);}

    @Override
    public void saveOrUpdate(Genre theGenre) {
        genreDao.saveOrUpdate(theGenre);}

    @Override
    public void deleteById(int genreId) {
        genreDao.deleteById(genreId);}

}
