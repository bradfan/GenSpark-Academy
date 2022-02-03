package com.songapi.apipractice.dao;

import com.songapi.apipractice.entity.Song;

import java.util.List;

public interface SongDao {
    List<Song> findAll();
    Object findById(int songId);
    void saveOrUpdate(Song theSong);
    void deleteById(int songId);
}
