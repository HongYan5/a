package cn.centychen.example.spring.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Cent.Chen
 * @date 2019/7/30 6:47 PM
 * @Description
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
