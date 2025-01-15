package id.my.hendisantika.springbootconsul;

import id.my.hendisantika.springbootconsul.config.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties(value = ApplicationConfig.class)
public class SpringBootConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConsulApplication.class, args);
    }

}
