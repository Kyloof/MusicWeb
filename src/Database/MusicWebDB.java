package Database;

import Music.Album;
import Music.Artist;
import Music.Song;
import Users.People;
import lombok.Getter;

import java.util.ArrayList;

public class MusicWebDB {
    @Getter
    private static ArrayList<Artist> artistsList;
    @Getter
    private static ArrayList<Album> albumList;
    @Getter
    private static ArrayList<Song> songList;
    @Getter
    private static ArrayList<People> peopleList;
}
