package work.idler.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:https://blog.idler.work
 * @Date:2019/5/13
 * @Description:work.idler.hello.spring.cloud.eureka.controller
 * @version:1.0
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port; // 注入端口号

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(String message) {
        return String.format("Hello %s port is : %s", message, port);
    }
}
