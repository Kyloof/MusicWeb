package Users;

import DataValidation.*;
import MusicWebApp.MusicWebApp;

import java.util.Date;
import java.util.HashMap;

public class Admin extends VerifiedUser{
    public Admin(String username, String password, String email, String userInfo) {
        super(username, password, email, userInfo);
    }

    @Override
    void addAlbumReview() {

    }

    @Override
    void addSongReview() {

    }

    public void getListOfUsers(){

    }

    public void deleteUser(int id){
        try{
            DataValidation.CheckIfUserIsDeletable(MusicWebApp.getPeopleList().get(id));
            MusicWebApp.getPeopleList().remove(id);
        } catch (MusicWebException e) {
            throw new RuntimeException(e);
        }
    }

    public void GrantMusicCriticPermission(){

    }

    public void GrantAdminPermission(){

    }


}
