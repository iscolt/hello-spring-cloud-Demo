package work.idler.hello.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther:https://blog.idler.work
 * @Date:2019/5/13
 * @Description:work.idler.hello.spring.cloud.web.admin.ribbon.service
 * @version:1.0
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 连不上就返回 hiError 这个方法
     *
     * @param message
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHello(String message) {
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hello?message=" + message, String.class);
    }

    /**
     * 连不上返回的方法（熔断）
     *
     * @param message
     * @return
     */
    public String hiError(String message) {
        return String.format("Hi your message is : %s but request bad", message);
    }
}
