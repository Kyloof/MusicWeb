package Users;

import DataValidation.*;
import MusicWebApp.MusicWebApp;

import java.util.Date;

public class Admin extends VerifiedUser{
    public Admin(int id, String username, String email, Date dateJoined, String userInfo) {
        super(id, username, email, dateJoined, userInfo);
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


}
