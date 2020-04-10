package ua.kiev.prog;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
    private static final UsersList UserList = new UsersList();


    private final List<Users> UserArray = new ArrayList<Users>();


    public static UsersList getInstance() {
        return UserList;
    }

    private UsersList() {

    }


    private void userExist(String login, String password) {

        for (Users us : UserArray)
            if (us.getLogin().equals(login)) {
                if (us.getPassword().equals(password)) {
                    System.out.println(":)");
                } else
                    System.out.println("!!");
                break;
            }
    }


    private void addUsers(String login, String password) {

        for (Users us : UserArray)
            if (us.getLogin() == null) {
                if (us.getPassword() == null) {
                    UserArray.add(us);
                }
            }

    }
}