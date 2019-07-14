package work.idler.hello.spring.cloud.web.admin.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther:https://blog.idler.work
 * @Date:2019/5/13
 * @Description:work.idler.hello.spring.cloud.web.admin.feign
 * @version:1.0
 */
@SpringBootApplication
@EnableDiscoveryClient // 注册到服务中心
@EnableFeignClients // 开启 Feign 功能
@EnableHystrixDashboard // 开启 熔断监控
public class WebAdminFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeignApplication.class, args);
    }
}
