package id.my.hendisantika.springbootconsul.service;

import id.my.hendisantika.springbootconsul.entity.Employee;
import id.my.hendisantika.springbootconsul.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/01/25
 * Time: 07.16
 * To change this template use File | Settings | File Templates.
 */
@Service("employeeService")
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
