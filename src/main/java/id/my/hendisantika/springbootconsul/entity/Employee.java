package id.my.hendisantika.springbootconsul.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;

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
@Data
@AllArgsConstructor
@RefreshScope
@NoArgsConstructor
@DynamoDBTable(tableName = "employees")
public class Employee {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String empid;

    @Value("${orgId}")
    @DynamoDBAttribute
    private String orgId;

    @DynamoDBAttribute
    private String firstName;

    @DynamoDBAttribute
    private String lastName;

    @DynamoDBAttribute
    private String email;

    @DynamoDBAttribute
    private Department department;
}
