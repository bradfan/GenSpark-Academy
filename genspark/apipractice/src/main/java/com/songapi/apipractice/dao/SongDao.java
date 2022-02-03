package com.songapi.apipractice.dao;

import com.songapi.apipractice.entity.Song;

import java.util.List;

//DAO = Data Access Object
public interface SongDao {
    List<Song> findAll();
    Object findById(int songId);
    void saveOrUpdate(Song theSong);
    void deleteById(int songId);
}
