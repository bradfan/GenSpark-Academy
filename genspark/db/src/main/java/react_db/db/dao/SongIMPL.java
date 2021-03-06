package react_db.db.dao;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import react_db.db.entity.Song;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

//DAO = Data Access Object
//Implements functionality for the methods called in DAO/SongService
@Repository
public class SongIMPL implements SongDao {

    private final EntityManager entityManager;

    @Autowired
    public SongIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Song> findAll() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Song> myQuery = currentSession.createQuery("from Song");
        return myQuery.getResultList();
    }

    @Override
    @Transactional
    public Song findById(int songId) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Song.class, songId);
    }

    //    findByArtist code does not work in Postman - code left in place (service, DAO, Controller)
    @Override
    @Transactional
    public Song findByArtist(Song artistName) {
        Session currentSession = entityManager.unwrap(Session.class);
        return currentSession.get(Song.class, (Serializable) artistName);
    }

    @Override
    @Transactional
    public void saveOrUpdate(Song theSong) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(theSong);
    }

    @Override
    @Transactional
    public void deleteById(int songId) {
        Session currentSession = entityManager.unwrap(Session.class);
        Song mySong = currentSession.get(Song.class, songId);
        currentSession.delete(mySong);
    }


}
