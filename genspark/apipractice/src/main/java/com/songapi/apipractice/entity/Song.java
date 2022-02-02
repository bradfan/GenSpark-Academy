package com.songapi.apipractice.entity;


import javax.persistence.*;

@Entity
@Table(name = "song_list")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "song_title")
    private String songTitle;


    @Column(name = "artist_name")
    private String artistName;

    @Column(name = "on_album")
    private String onAlbum;

//    default Constructor
    public Song() {
    }

    public Song(int id, String songTitle, String artistName, String onAlbum) {
        this.id = id;
        this.songTitle = songTitle;
        this.artistName = artistName;
        this.onAlbum = onAlbum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getOnAlbum() {
        return onAlbum;
    }

    public void setOnAlbum(String onAlbum) {
        this.onAlbum = onAlbum;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", songTitle='" + songTitle + '\'' +
                ", artistName='" + artistName + '\'' +
                ", onAlbum='" + onAlbum + '\'' +
                '}';
    }
    
}
