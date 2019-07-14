package work.idler.hello.spring.cloud.web.admin.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import work.idler.hello.spring.cloud.web.admin.ribbon.service.AdminService;

/**
 * @Auther:https://blog.idler.work
 * @Date:2019/5/13
 * @Description:work.idler.hello.spring.cloud.web.admin.ribbon.controller
 * @version:1.0
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String SayHello(String message) {
        return adminService.sayHello(message);
    }
}
