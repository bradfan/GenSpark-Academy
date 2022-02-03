package com.songapi.apipractice.controller;


import com.songapi.apipractice.entity.Song;
import com.songapi.apipractice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {

    public final SongService songService;

//    Constructor Injection
    @Autowired
    SongController(@Qualifier("songServiceIMPL") SongService songService) {
        this.songService = songService;
    }

    //http://localhost:8080/retrieveAllSongs
    @GetMapping("/retrieveAllSongs")
    public List<Song> findAll() {
        return songService.findAll();
    }

    //http://localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{songId}")
    public Object findById(@PathVariable int songId) {
        return songService.findById(songId);
    }

    //http://localhost:8080/addSong
    @PostMapping("/addSong")
    public Song addSong(@RequestBody Song theSong) {
        theSong.setId(0);
        songService.saveOrUpdate(theSong);
        return theSong;
    }

    //http://localhost:8080/updateSong
    @PutMapping("/updateSong")
    public Song updateSong(@RequestBody Song updateSong) {
        songService.saveOrUpdate(updateSong);
        return updateSong;
    }

    //http://localhost:8080/deleteSong/1
    @DeleteMapping("/deletePart/{songId}")
    public String deleteSong(@PathVariable int songId) {
        songService.deleteById(songId);
        return "Deleted song ID: " + songId;
    }


}
