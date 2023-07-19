package com.example.webAppOne.services;

import com.example.webAppOne.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserSer {

    private List<User> userList;

    public UserSer() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Java", 100,"java@yahoo.com");
        User user2 = new User(2, "HTMl", 120,"html@yahoo.com");
        User user3 = new User(3, "CSS", 110,"css@yahoo.com");
        User user4 = new User(4, "python", 60,"py@yahoo.com");
        User user5 = new User(5, "Ruby", 22,"R@yahoo.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public User getuser(Integer id) {

        for (User userr:userList) {
            if(id == userr.getId()){
                return userr;
            }
        }

        return null;
    }
}
