package id.my.hendisantika.springbootconsul.controller;

import id.my.hendisantika.springbootconsul.config.ApplicationConfig;
import id.my.hendisantika.springbootconsul.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/01/25
 * Time: 07.19
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RefreshScope
@EnableDiscoveryClient
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    private final ApplicationConfig applicationConfig;
}
