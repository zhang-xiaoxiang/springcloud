package com.example.eureka.invoke.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * InvokeApi:服务发现调用端
 *
 * @author zhangxiaoxiang
 * @date: 2019/08/04
 */
@RestController
@Configuration
@Slf4j
public class InvokeApi {
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 测试调用另一个服务(其他客户端提供的服务,当然是注册到注册中心的服务才可以调到)
     *
     * @return
     */
    @RequestMapping("/router")
    public String invoke() {
        RestTemplate restTemplate = getRestTemplate();
        log.info("调用服务----------");
        String forObject = restTemplate.getForObject("http://client/index/?name=myname", String.class);
        return forObject;
    }


}
