package org.emp.service.impl;

import org.emp.dto.User;
import org.emp.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        return "register";
    }
}
