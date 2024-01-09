package Users;

import java.util.Date;

public class PermissionUser extends VerifiedUser{
    private String level;

    public PermissionUser(int id, String username, String email, Date dateJoined, String userInfo) {
        super(id, username, email, dateJoined, userInfo);
    }

    @Override
    void addAlbumReview() {

    }

    @Override
    void addSongReview() {

    }
}
