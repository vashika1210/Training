package com.dao.daos;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public class UserDao {
    private Map<String, String> users;

    public UserDao() {
        users = new HashMap<>();
        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("user3", "password3");
        users.put("user4", "password4");
        users.put("user5", "password5");
    }

    public boolean isValidUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
