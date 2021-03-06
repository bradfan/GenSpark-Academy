package com.songapi.apipractice.dao;

import com.songapi.apipractice.entity.Song;

import java.util.List;

//DAO = Data Access Object
public interface SongDao {
    List<Song> findAll();
    Object findById(int songId);
    List<Song> findSongsByArtist(String artistName);
    List<Song> findGenreByArtist(String artistName);
    void saveOrUpdate(Song theSong);
    void deleteById(int songId);
}
