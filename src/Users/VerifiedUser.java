package Users;

import java.util.Date;
import java.util.HashMap;

public abstract class VerifiedUser extends People{
    public VerifiedUser(String username, String password, String email, String userInfo) {
        super(username, password, email, userInfo);
    }

    abstract void addAlbumReview();
    abstract void addSongReview();

    public void addArtist(){

    }

    public void addAlbum(){

    }

    public void addSong(){

    }

    public void showRequestList(){

    }
}
