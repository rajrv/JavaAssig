package com.example.SpringSecurityLearn.Services;

import com.example.SpringSecurityLearn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    List<User> list = new ArrayList<>();


    public UserService(){
        list.add(new User("abc","pwd","abc@gmail.com"));
        list.add(new User("abc","pwd","abc@gmail.com"));
    }

    public List<User> getAllUser()
    {
        return list;
    }

    public User getUser(String username)
    {
        return this.list.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    public User addUser(User user)
    {
        list.add(user);
        return user;
    }


}
