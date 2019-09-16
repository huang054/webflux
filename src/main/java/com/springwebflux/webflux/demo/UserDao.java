package com.springwebflux.webflux.demo;


import org.springframework.stereotype.Repository;




@Repository
public class UserDao {




    public User insertUser(String userName) {

        User user=new User();
        user.setName(userName);
        user.setId(1);
        return user;
    }
}
