package org.emp.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.emp.dto.User;
import org.emp.entity.UserEntity;
import org.emp.repository.UserRepository;
import org.emp.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final ObjectMapper mapper;
    private final UserRepository userRepository;

    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public User register(User user) {
        UserEntity saved = userRepository.save(mapper.convertValue(user, UserEntity.class));
        return mapper.convertValue(saved,User.class);
    }
}
