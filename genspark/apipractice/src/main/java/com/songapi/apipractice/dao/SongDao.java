package com.songapi.apipractice.dao;

import com.songapi.apipractice.entity.Song;

import java.util.List;

//DAO = Data Access Object
public interface SongDao {
    List<Song> findAll();
    Object findById(int songId);
    @org.springframework.data.jpa.repository.Query("FROM songs WHERE artist_name = ?1")
    List<Song> findSongsByArtist(String artistName);
    void saveOrUpdate(Song theSong);
    void deleteById(int songId);
}
