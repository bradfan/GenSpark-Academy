package react_db.db.service;


import react_db.db.entity.Song;

import java.util.List;

public interface SongService {
    List<Song> findAll();
    Object findById(int songID);
    Object findByArtist(Song artistName);
    void saveOrUpdate(Song theSong);
    void deleteById(int songId);
}
