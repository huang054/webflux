package com.springwebflux.webflux.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Mono;

import java.sql.SQLException;

@Configuration
public class FluxController {

    private final UserDao userDao;

    public FluxController(UserDao userDao) {
        this.userDao = userDao;
    }


    @Bean
    public RouterFunction<ServerResponse> find() throws SQLException {

        User user=userDao.insertUser("name");
        Mono<User> user1= Mono.just(user);


       return RouterFunctions.route(RequestPredicates.path("/user"),
                request-> ServerResponse.ok().body(user1, User.class));


    }
}
