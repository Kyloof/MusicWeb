package Music;

import DataValidation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Album implements Serializable {
    private int albumId;
    private String albumTitle;
    private String genre;
    private double rating;
    private Date releaseDate;
    private ArrayList<Song> songList;


    public void addSong(Song song){
        try{
            DataValidation.CheckIfSingle(song);
        } catch (MusicWebException e) {
            throw new RuntimeException(e);
        }
    }




}
