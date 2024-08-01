package org.emp.controller;

import org.emp.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/emp")
public class UserController {
    @PostMapping("auth/login")
    public boolean login(@RequestBody User user){
        return false;
    }
    @PostMapping("register")
    public String register(@RequestBody User user){
        return "register User";
    }
}
