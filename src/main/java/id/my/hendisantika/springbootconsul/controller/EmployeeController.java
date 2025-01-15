package id.my.hendisantika.springbootconsul.controller;

import id.my.hendisantika.springbootconsul.config.ApplicationConfig;
import id.my.hendisantika.springbootconsul.entity.Employee;
import id.my.hendisantika.springbootconsul.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Slf4j
@RestController
@RefreshScope
@EnableDiscoveryClient
@RequestMapping("/api/v1/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    private final ApplicationConfig applicationConfig;

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employeeObj) {
        log.info(applicationConfig.getUserName());
        log.info(applicationConfig.getPassword());
        return employeeService.save(employeeObj);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") String employeeId) {
        return employeeService.getEmployeeId(employeeId);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") String employeeId) {
        return employeeService.deleteEmployee(employeeId);
    }
}
