package react_db.db.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import react_db.db.dao.SongDao;
import react_db.db.entity.Song;

import java.util.List;

//Implements the DAO
@Service
public class SongServiceIMPL implements SongService{

    private final SongDao songDao;

    @Autowired
    public SongServiceIMPL(SongDao songDao) {this.songDao = songDao; }

    @Override
    public List<Song> findAll() {return songDao.findAll();}

    @Override
    public Object findById(int songId) {return songDao.findById(songId);}

    @Override
    public Object findByArtist(Song artistName) {return songDao.findByArtist(artistName);}

    @Override
    public void saveOrUpdate(Song theSong) {songDao.saveOrUpdate(theSong);}

    @Override
    public void deleteById(int songId) {songDao.deleteById(songId);}

}
