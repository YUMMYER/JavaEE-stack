package tuts.farruh.database;

import sun.rmi.runtime.Log;
import tuts.farruh.domain.LoginUser;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<LoginUser> loginUserList = new ArrayList<LoginUser>();

    public static void addUser(LoginUser user) {
        loginUserList.add(user);
    }

    public static boolean isUserExist(LoginUser user) {
        LoginUser user1 = new LoginUser("farruhx", "12345");
        loginUserList.add(user1);
        for (LoginUser us : loginUserList) {
            if (us.getPassword().equals(user.getPassword()) && us.getUsername().equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }
}
