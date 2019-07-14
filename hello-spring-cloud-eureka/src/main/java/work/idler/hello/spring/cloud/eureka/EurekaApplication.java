package work.idler.hello.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther:https://blog.idler.work
 * @Date:2019/5/13
 * @Description:work.idler.hello.spring.cloud.eureka
 * @version:1.0
 */

@SpringBootApplication
@EnableEurekaServer // 开启Eureka服务端
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
