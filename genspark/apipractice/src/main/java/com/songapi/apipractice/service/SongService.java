package com.songapi.apipractice.service;

import com.songapi.apipractice.entity.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();
    Object findById(int songID);
    void saveOrUpdate(Song theSong);
    void deleteById(int songId);
}
