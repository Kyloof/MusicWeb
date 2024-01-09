package LoginSystem;

import java.util.HashMap;

public class IDandPassword {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    public IDandPassword() {

    }
    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
