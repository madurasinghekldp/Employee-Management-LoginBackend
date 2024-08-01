package org.emp.controller;

import lombok.RequiredArgsConstructor;
import org.emp.dto.User;
import org.emp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/emp")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    @PostMapping("auth/login")
    public boolean login(@RequestBody User user){
        return userService.login(user);
    }
    @PostMapping("register")
    public User register(@RequestBody User user){
        return userService.register(user);
    }
}
