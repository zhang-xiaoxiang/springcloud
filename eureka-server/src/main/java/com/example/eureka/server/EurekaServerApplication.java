package com.example.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
/**
 * EurekaServerApplication:eureka服务端
 * @author zhangxiaoxiang
 * @date 2019/8/4
 */
public class EurekaServerApplication {

    public static void main(String[] args) {
        System.out.println("请输入需要打开的服务器slave1  slave2");
        Scanner scanner=new Scanner(System.in);
        String profile=scanner.nextLine();
        // SpringApplication.run(EurekaServerApplication.class, args);
        new SpringApplicationBuilder(EurekaServerApplication.class).profiles(profile).run(args);
    }


}
