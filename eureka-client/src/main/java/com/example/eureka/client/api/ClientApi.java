package com.example.eureka.client.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * ClientApi:是客户端(服务提供者,注意提供者和调用者是相对的概念,和IO流的输入输出一个意思)
 *
 * @author zhangxiaoxiang
 * @date: 2019/08/04
 */
@RestController
@RequestMapping
public class ClientApi {
    /**
     * 这台服务器提供一个服务(是客户端,在这里也算一个服务提供者)
     *
     * 注解@RequestParam 和 @PathVarible的区别
     *
     * @RequestParam是请求中的参数。index？name=zhangxiaoxiang
     *
     * @PathVarible是请求路径中的变量如 index/zhangxiaoxiang   推荐
     *
     * @param name
     * @return
     */
    @GetMapping("/index/{name}")
    public String index(@PathVariable("name") String name, HttpServletRequest request) {
        return "你好 " + name + " ,我是eureka 客户端,同时可以提供服务,请求URL: "+request.getRequestURL();
    }
}
