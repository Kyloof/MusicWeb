package Users;

import java.util.Date;

public class CasualUser extends People{
    private String level;

    public CasualUser(int id, String username, String email, Date dateJoined, String userInfo, String level) {
        super(id, username, email, dateJoined, userInfo);
        this.level = level;
    }


    public void addAlbumReview() {

    }


    public void addSongReview() {

    }
}
