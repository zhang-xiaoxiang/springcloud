package com.example.eureka.invoke.api;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.websocket.server.PathParam;

/**
 * InvokeApi:服务发现调用端
 *
 * @author zhangxiaoxiang
 * @date: 2019/08/04
 */
@RestController
@Configuration
public class InvokeApi {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    /**
     * 测试调用另一个服务(其他客户端提供的服务,当然是注册到注册中心的服务才可以调到)
     * @return
     */
    @RequestMapping("/router")
    public String invoke(){
        RestTemplate restTemplate = getRestTemplate();

        String forObject = restTemplate.getForObject("http://client/index?name=长草颜团子", String.class);
        return forObject;
    }






}
