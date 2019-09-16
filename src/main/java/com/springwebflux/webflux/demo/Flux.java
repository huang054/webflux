package com.springwebflux.webflux.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Flux {


    private final Handder bannerHandler;

    public Flux(Handder bannerHandler) {
        this.bannerHandler = bannerHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> webFluxRoutesRegister(){
        return RouterFunctions
                .route(RequestPredicates.GET("/banner/getList"), bannerHandler::getList);//查询 json响应

    }
}
