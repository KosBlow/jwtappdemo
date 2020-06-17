package net.blow.jwtappdemo.service;

import net.blow.jwtappdemo.model.User;

import java.util.List;

public interface UserService {
    User register(User user);

    List<User> getAll();

    User findByUserName(String username);

    User findById(long id);

    void delete(Long id);
}
