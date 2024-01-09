package Users;

import java.util.Date;

public class MusicCritic extends VerifiedUser{
    private String name;
    private String surname;

    public MusicCritic(int id, String username, String email, Date dateJoined, String userInfo) {
        super(id, username, email, dateJoined, userInfo);
    }


    @Override
    void addAlbumReview() {

    }

    @Override
    void addSongReview() {

    }
}
