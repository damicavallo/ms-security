package com.accenture.security.service;

import com.accenture.security.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
