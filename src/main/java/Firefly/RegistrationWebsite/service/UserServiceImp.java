package Firefly.RegistrationWebsite.service;


import Firefly.RegistrationWebsite.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Firefly.RegistrationWebsite.entity.User;

import java.util.List;


@Service
public class  UserServiceImp implements  UserService{

    @Autowired
   private UserMapper userMapper;

    @Override
    public void addUser(User user){
       userMapper.insert(user);
      }

    @Override
    public void deleteByPrimaryKey(Integer  id){
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUser(){
        return userMapper.selectAll();
    }

}
