package id.my.hendisantika.springbootconsul.repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBSaveExpression;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
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

    public Employee getEmployeeId(String employeeId) {
        return dynamoDBMapper.load(Employee.class, employeeId);
    }

    public String deleteEmployee(String employeeId) {
        Employee emp = dynamoDBMapper.load(Employee.class, employeeId);
        dynamoDBMapper.delete(emp);
        return "Employee Deleted";
    }

    public String updateEmployee(String employeeId, Employee empObj) {
        dynamoDBMapper.save(empObj, new DynamoDBSaveExpression().withExpectedEntry(employeeId, new ExpectedAttributeValue(new AttributeValue().withS(employeeId))));
        return employeeId;
    }

}
