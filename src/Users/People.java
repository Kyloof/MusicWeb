package Users;

import java.io.Serializable;
import java.util.Date;



public abstract class People implements Serializable {
    private String username;
    private String password;
    private String email;
    private Date dateJoined;
    private String userInfo;


    public People(String username, String email, Date dateJoined, String userInfo) {
        this.username = username;
        this.email = email;
        this.dateJoined = dateJoined;
        this.userInfo = userInfo;
    }


    public void showAlbums(){

    }
    public void showAlbumsData(){

    }


}
