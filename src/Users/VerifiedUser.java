package Users;

import java.util.Date;

public abstract class VerifiedUser extends People{
    public VerifiedUser(int id, String username, String email, Date dateJoined, String userInfo) {
        super(id, username, email, dateJoined, userInfo);
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
