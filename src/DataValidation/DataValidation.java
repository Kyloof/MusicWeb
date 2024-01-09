package DataValidation;

import Music.*;
import Users.*;


public class DataValidation{
    public static void CheckIfSingle(Song song) throws MusicWebException{
        if (!song.isSingle()){
            throw new MusicWebException("Podania piosenka nie jest singlem");
        }
    }

    public static void CheckIfUserIsDeletable(People people) throws MusicWebException{
        if (people instanceof Admin || people instanceof MusicCritic){
            throw new MusicWebException("Tego użytkownika nie możesz usunąć");
        }
    }
}
