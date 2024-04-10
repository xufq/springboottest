package com.xufq.springboottest.service;

import com.xufq.springboottest.entity.User;
import com.xufq.springboottest.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserByName(String name){
        return userRepository.getByName(name);
    }

    public Integer createUser(User user){
        User saved = userRepository.save(user);
        return saved.getId();
    }
}
