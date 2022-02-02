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

    @GetMapping("/retrieveAllSongs")
    public List<Song> findAll() {
        return songService.findAll();
    }

    @GetMapping("/retrieveById/{songId}")
    public Object findById(@PathVariable int songId) {
        return songService.findById(songId);
    }

    @PutMapping("/updateSong")
    public Song updateSong(@RequestBody Song updateSong) {
        songService.saveOrUpdate(updateSong);
        return updateSong;
    }

    @DeleteMapping("/deletePart/{songtId}")
    public String deleteSong(@PathVariable int songId) {
        songService.deleteById(songId);
        return "Deleted song ID: " + songId;
    }


}
