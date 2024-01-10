package Users;

import java.util.Date;
import java.util.HashMap;

public class MusicCritic extends VerifiedUser{
    private String name;
    private String surname;

    public MusicCritic(String username,String password, String email, String userInfo) {
        super(username, password, email, userInfo);
    }


    @Override
    void addAlbumReview() {

    }

    @Override
    void addSongReview() {

    }
}
