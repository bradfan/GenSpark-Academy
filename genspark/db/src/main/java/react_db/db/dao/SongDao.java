package react_db.db.dao;


import react_db.db.entity.Song;

import java.util.List;

//DAO = Data Access Object
public interface SongDao {
    List<Song> findAll();
    Object findById(int songId);
    Object findByArtist(Song artistName);
    void saveOrUpdate(Song theSong);
    void deleteById(int songId);
}
