package Database;

import lombok.Getter;

import java.util.HashMap;

public class UsernamesAndPasswords {

    @Getter
    private static HashMap<String,String> loginInfo = new HashMap<String,String>();


}