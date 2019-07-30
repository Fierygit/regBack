package Firefly.RegistrationWebsite.service;


import Firefly.RegistrationWebsite.entity.User;

public interface UserService {

    void addUser(User user);

    void deleteByPrimaryKey(Integer id);

}
