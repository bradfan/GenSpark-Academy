package com.songapi.apipractice.controller;

import com.songapi.apipractice.entity.Genre;
import com.songapi.apipractice.entity.Song;
import com.songapi.apipractice.service.GenreService;
import com.songapi.apipractice.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is to allow calls from React...
@CrossOrigin(origins = { "http://localhost:3000"})
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
    public List<Genre> findAllGenre() {
        return genreService.findAllGenre();
    }

    //   localhost:8080/retrieveByGenreId/1
    @GetMapping("/retrieveByGenreId/{genreId}")
    public Object findByGenreId(@PathVariable int genreId) {
        return genreService.findByGenreId(genreId);
    }

    //   localhost:8080/addGenre
    @PostMapping("/addGenre")
    public Genre addGenre(@RequestBody Genre theGenre) {
        theGenre.setId(0);
        genreService.saveOrUpdateGenre(theGenre);
        return theGenre;
    }

    //   localhost:8080/updateGenre
    @PutMapping("/updateGenre")
    public Genre updateGenre(@RequestBody Genre updateGenre) {
        genreService.saveOrUpdateGenre(updateGenre);
        return updateGenre;
    }

    //    localhost:8080/deleteGenre/1
    @DeleteMapping("/deleteGenre/{genreId}")
    public String deleteGenre(@PathVariable int genreId) {
        genreService.deleteByGenreId(genreId);
        return "Deleted genre ID: " + genreId;
    }

}
