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

    public static void CheckIfEmailIsCorrect(String email) throws MusicWebException{
        if (!email.contains("@") || email.length()<5)
            throw new MusicWebException("Podano nieprawidłowy mail");
    }

    public static void isUsernameTaken(String searchedUsername) throws MusicWebException{
        if (!(Database.MusicWebDB.getPeopleList()==null))
            for (People person : Database.MusicWebDB.getPeopleList()){
                if (person.getUsername().equals(searchedUsername)){
                    throw new MusicWebException("Podana nazwa użytkownika jest już zajęta");
            }
        }
    }
}



