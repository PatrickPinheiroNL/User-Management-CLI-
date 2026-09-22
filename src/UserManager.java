import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class UserManager {
    List<User> users = new ArrayList<>();

    public void createUser(int id, String name, String email, String password){
        User user1 = new User(id, name, email, password);
        users.add(user1);
    }

    public User getElementById(int id){
        for(User user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}

