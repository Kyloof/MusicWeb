package Music;

import DataValidation.DataValidation;

import DataValidation.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Artist implements Serializable {

    private int artistId;
    private double rating;
    private String artistName;
    private String artistInfo;
    private ArrayList<String> members;
    private ArrayList<Album> albumList;
    private ArrayList<Song> singleList;

    public void addAlbum(Album album){
        albumList.add(album);
    }

    public void addSingle(Song song){
        try{
            DataValidation.CheckIfSingle(song);
            singleList.add(song);
        } catch (MusicWebException e) {
            throw new RuntimeException(e);
        }
    }

}
