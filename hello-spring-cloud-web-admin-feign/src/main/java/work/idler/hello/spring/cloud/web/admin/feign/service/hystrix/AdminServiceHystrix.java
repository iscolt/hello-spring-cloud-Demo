package work.idler.hello.spring.cloud.web.admin.feign.service.hystrix;

import org.springframework.stereotype.Component;
import work.idler.hello.spring.cloud.web.admin.feign.service.AdminService;

/**
 * AdminService 的熔断器
 *
 * @author iscolt
 * @date 2019/07/13
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHello(String message) {
        return String.format("Hi your message is : %s but request bad", message);
    }
}
