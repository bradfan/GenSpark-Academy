package com.songapi.apipractice.controller;

import com.songapi.apipractice.entity.Genre;
import com.songapi.apipractice.entity.Song;
import com.songapi.apipractice.service.GenreService;
import com.songapi.apipractice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GenreController {
    public final GenreService genreService;

//    Constructor Injection
@Autowired
GenreController(@Qualifier("genreServiceIMPL") GenreService genreService) {
    this.genreService = genreService;
}

    //   localhost:8080/retrieveAllGenres
    @GetMapping("/retrieveAllGenres")
    public List<Song> findAll() {
        return genreService.findAll();
    }

    //   localhost:8080/retrieveById/1
    @GetMapping("/retrieveById/{genreId}")
    public Object findById(@PathVariable int genreId) {
        return genreService.findById(genreId);
    }

    //   localhost:8080/addSong
    @PostMapping("/addGenre")
    public Genre addGenre(@RequestBody Genre theGenre) {
        theGenre.setId(0);
        genreService.saveOrUpdate(theGenre);
        return theGenre;
    }

    //   localhost:8080/updateGenre
    @PutMapping("/updateGenre")
    public Genre updateGenre(@RequestBody Genre updateGenre) {
        genreService.saveOrUpdate(updateGenre);
        return updateGenre;
    }

    //    localhost:8080/deleteGenre/1
    @DeleteMapping("/deleteGenre/{genreId}")
    public String deleteGenre(@PathVariable int genreId) {
        genreService.deleteById(genreId);
        return "Deleted genre ID: " + genreId;
    }

}
