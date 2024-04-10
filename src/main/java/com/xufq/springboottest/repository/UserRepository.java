package com.xufq.springboottest.repository;

import com.xufq.springboottest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User getByName(String name);
}
