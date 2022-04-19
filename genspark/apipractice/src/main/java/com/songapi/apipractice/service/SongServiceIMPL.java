package com.songapi.apipractice.service;


import com.songapi.apipractice.dao.SongDao;
import com.songapi.apipractice.entity.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//Implements the DAO
@Service
public class SongServiceIMPL  implements SongService{

    private final SongDao songDao;

    @Autowired
    public SongServiceIMPL(SongDao songDao) {this.songDao = songDao; }

    @Override
    public List<Song> findAll() {return songDao.findAll();}

    @Override
    public Object findById(int songId) {return songDao.findById(songId);}

    @Override
    public Object findByArtist(String artistName) {return songDao.findByArtist();}

    @Override
    public void saveOrUpdate(Song theSong) {songDao.saveOrUpdate(theSong);}

    @Override
    public void deleteById(int songId) {songDao.deleteById(songId);}

}
