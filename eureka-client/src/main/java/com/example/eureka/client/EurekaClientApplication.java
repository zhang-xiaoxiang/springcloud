package com.example.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.Scanner;

@SpringBootApplication
/**
 * EurekaClientApplication:eureka客户端
 * @author zhangxiaoxiang
 * @date 2019/8/4
 */
public class EurekaClientApplication {

    public static void main(String[] args) {
        System.out.println("请输入需要打开的客户端端口号8080  8081");
        Scanner scanner=new Scanner(System.in);
        String port=scanner.nextLine();
        // SpringApplication.run(EurekaClientApplication.class, args);
        new SpringApplicationBuilder(EurekaClientApplication.class).properties("server.port="+port).run(args);

    }

}
