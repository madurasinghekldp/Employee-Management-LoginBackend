package org.emp.service;

import org.emp.dto.User;

public interface UserService {
    boolean login(User user);
    String register(User user);
}
