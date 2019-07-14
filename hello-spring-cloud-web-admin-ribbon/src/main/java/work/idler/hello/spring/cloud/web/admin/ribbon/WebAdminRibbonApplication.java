package work.idler.hello.spring.cloud.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Auther:https://blog.idler.work
 * @Date:2019/5/13
 * @Description:work.idler.hello.spring.cloud.web.admin.ribbon
 * @version:1.0
 */
@SpringBootApplication
@EnableDiscoveryClient // 注册到服务中心
@EnableHystrix // 开启熔断器
@EnableHystrixDashboard // 开启 熔断监控
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class, args);
    }
}
