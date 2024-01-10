package MusicWebApp;

import Database.UsernamesAndPasswords;
import LoginSystem.LoginPage;
import LoginSystem.WelcomePage;
import Music.*;
import Users.People;
import lombok.Getter;

import java.util.ArrayList;


public class MusicWebApp {
    @Getter
    private static ArrayList<Artist> artistsList;
    @Getter
    private static ArrayList<Album> albumList;
    @Getter
    private static ArrayList<Song> songList;
    @Getter
    private static ArrayList<People> peopleList;



    public static void main(String[] args) {

        WelcomePage welcomePage = new WelcomePage();

    }
}