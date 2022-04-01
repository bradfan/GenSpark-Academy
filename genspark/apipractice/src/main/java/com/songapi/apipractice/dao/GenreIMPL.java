package com.songapi.apipractice.dao;


import com.songapi.apipractice.entity.Genre;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

//DAO = Data Access Object
//Implements functionality for the methods called in DAO/SongService
@Repository
public class GenreIMPL implements GenreDao {

    private final EntityManager entityManager;

    @Autowired
    public GenreIMPL(EntityManager entityManager) {this.entityManager = entityManager;}

    @Override
    @Transactional
    public List<Genre> findAllGenres() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Genre> myQuery = currentSession.createQuery("from Genre");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Genre findByGenreId(int genreId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Genre.class, genreId);
    }

    @Override
    @Transactional
    public  void saveOrUpdateGenre(Genre theGenre) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theGenre);
    }

    @Override
    @Transactional
    public void deleteByGenreId(int genreId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Genre myGenre = currentSession.get(Genre.class, genreId);
        currentSession.delete(myGenre);
    }


}
