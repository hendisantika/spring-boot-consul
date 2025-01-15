package id.my.hendisantika.springbootconsul.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-consul
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/01/25
 * Time: 07.12
 * To change this template use File | Settings | File Templates.
 */
@Data
@ConfigurationProperties(prefix = "user")
public class ApplicationConfig {
    private String userName;
    private String password;
}
