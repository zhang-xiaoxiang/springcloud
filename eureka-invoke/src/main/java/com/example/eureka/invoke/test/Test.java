package com.example.eureka.invoke.test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Test:测试默认的负载均衡---使用测试工具也行
 * <p>
 * httpclient日常操作
 *
 * @author zhangxiaoxiang
 * @date: 2019/08/04
 */
public class Test {
    public static void main(String[] args) throws IOException {
        // 创建默认实例
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //    调用N次服务
        for (int i = 0; i < 10; i++) {
            HttpGet httpGet = new HttpGet("http://localhost:9000/router");
            //    获取响应
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);
        //    解析返回的数据
            System.out.println(EntityUtils.toString(httpResponse.getEntity()));

        }
    }
}
