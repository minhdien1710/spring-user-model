package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User("john","123456","Tran van John", "tvjohn@yahoo.com.us",20);
        User u2 = new User("bill","2345","Bill","qwertygf@gmail.com", 22);
        User u3 = new User("nam","namnam","nguyen van nam","nam@gmail.com", 30);
        users.add(u1);
        users.add(u2);
        users.add(u3);
    }
    public static User checkLogin(Login login){
        for (User u : users){
            if(u.getAccount().equals(login.getAccount())
                && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
