package Users;

import java.util.Date;
import java.util.HashMap;

public class CasualUser extends People{
    private String level;

    public CasualUser(String username, String password, String email, String userInfo, String level) {
        super(username, password, email, userInfo);
        this.level = level;
    }


    public void addAlbumReview() {

    }


    public void addSongReview() {

    }
}
