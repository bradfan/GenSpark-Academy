package com.songapi.apipractice.entity;


import javax.persistence.*;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private Song song;
    @OneToOne(mappedBy = "genre")
    @JoinColumn(name = "artist_name")
    private String artistName;

    @Column(name = "genre_type")
    private String genreType;

    @Column(name = "label")
    private String label;

    //    default constructor
    public Genre() {

    }

    public Genre(int id, String artistName, String genreType, String label) {
        this.id = id;
        this.artistName = artistName;
        this.genreType = genreType;
        this.label = label;
    }
    


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", artistName='" + artistName + '\'' +
                ", genreType='" + genreType + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
