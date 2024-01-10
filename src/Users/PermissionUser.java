package Users;

import java.util.Date;
import java.util.HashMap;

public class PermissionUser extends VerifiedUser{
    private String level;

    public PermissionUser(String username, String password, String email, String userInfo) {
        super(username, password, email, userInfo);
    }

    @Override
    void addAlbumReview() {

    }

    @Override
    void addSongReview() {

    }
}
