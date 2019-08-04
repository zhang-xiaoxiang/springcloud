package com.example.eureka.server.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ServerApi:服务端接口
 *
 * @author zhangxiaoxiang
 * @date: 2019/08/04
 */
@RestController
@RequestMapping
public class ServerApi {

    @RequestMapping("/index")
    public String index(){
        return "欢迎来到spring cloud 的微服务世界";
    }

}
