package id.my.hendisantika.springbootconsul.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import id.my.hendisantika.springbootconsul.entity.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/01/25
 * Time: 07.14
 * To change this template use File | Settings | File Templates.
 */
@Repository
@RequiredArgsConstructor
public class EmployeeRepository {
    private final DynamoDBMapper dynamoDBMapper;

    public Employee save(Employee employee) {
        dynamoDBMapper.save(employee);
        return employee;
    }
}
