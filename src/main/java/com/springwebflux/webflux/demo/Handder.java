package com.springwebflux.webflux.demo;


import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class Handder {


    private final UserDao userDao;

    public Handder(UserDao userDao) {
        this.userDao = userDao;
    }

    public Mono<ServerResponse> getList(ServerRequest request) {
        //获取请求参数
        String page = request.queryParam("name").orElse("1");



        User  user = userDao.insertUser(page);

        return ServerResponse.ok().body(BodyInserters.fromObject(user));
    }



}