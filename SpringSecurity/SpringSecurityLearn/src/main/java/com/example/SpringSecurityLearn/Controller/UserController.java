package com.example.SpringSecurityLearn.Controller;

import com.example.SpringSecurityLearn.Services.UserService;
import com.example.SpringSecurityLearn.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getAllUser(){
       return userService.getAllUser();
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
        return userService.getUser(username);
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user)
    {
        return this.userService.addUser(user);
    }
}
