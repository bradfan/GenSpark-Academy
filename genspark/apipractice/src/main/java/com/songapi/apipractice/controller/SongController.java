package com.songapi.apipractice.controller;


import com.songapi.apipractice.entity.Song;
import com.songapi.apipractice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is to allow calls from React
@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
@RequestMapping("/song")
public class SongController {

    public final SongService songService;

//    Constructor Injection
    @Autowired
    SongController(@Qualifier("songServiceIMPL") SongService songService) {
        this.songService = songService;
    }


    //   localhost:8080/retrieveAllSongs
    @GetMapping("/retrieveAllSongs")
    public List<Song> findAll() {
        return songService.findAll();
    }

    //   localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{songId}")
    public Object findById(@PathVariable int songId) {
        return songService.findById(songId);
    }

    //   localhost:8080/retrieveByArtist/Metallica
    @GetMapping("/retrieveByArtist/{artistName}")
    public List<Song> findSongsByArtist(@PathVariable String artistName) {return songService.findSongsByArtist(artistName); }


    @GetMapping("/retrieveGenreByArtist/{artistName}")
    public List<Song> findGenreByArtist(@PathVariable String artistName) {return songService.findGenreByArtist(artistName); }

    //   localhost:8080/addSong
    @PostMapping("/addSong")
    public Song addSong(@RequestBody Song theSong) {
        theSong.setId(0);
        songService.saveOrUpdate(theSong);
        return theSong;
    }

    //   localhost:8080/updateSong
    @PutMapping("/updateSong")
    public Song updateSong(@RequestBody Song updateSong) {
        songService.saveOrUpdate(updateSong);
        return updateSong;
    }

    //    localhost:8080/deleteSong/1
    @DeleteMapping("/deleteSong/{songId}")
    public String deleteSong(@PathVariable int songId) {
        songService.deleteById(songId);
        return "Deleted song ID: " + songId;
    }

}
