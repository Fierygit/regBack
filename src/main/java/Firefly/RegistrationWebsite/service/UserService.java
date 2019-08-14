package Firefly.RegistrationWebsite.service;


import Firefly.RegistrationWebsite.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteByPrimaryKey(Integer id);

    List<User> getAllUser();
    }
