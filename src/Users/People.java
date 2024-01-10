package Users;

import Database.*;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;


@Getter
public abstract class People implements Serializable {
    private String username;
    private String password;
    private String email;
    private Date dateJoined;
    private String userInfo;



    public People(String username, String password, String email, String userInfo) {
        this.username=username;
        this.password=password;
        UsernamesAndPasswords.getLoginInfo().put(username,password);
        this.email = email;
        this.userInfo = userInfo;
    }


    public boolean doesPasswordEqual(String password) {
        return this.password.equals(password);
    }

    public void showAlbums(){

    }
    public void showAlbumsData(){

    }


}
