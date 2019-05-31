package org.hzero.swagger;

import org.hzero.autoconfigure.swagger.EnableHZeroSwagger;
import io.choerodon.eureka.event.EurekaEventHandler;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHZeroSwagger
@EnableDiscoveryClient
@SpringBootApplication
public class SwaggerApplication {

    public static void main(String[] args) {
        EurekaEventHandler.getInstance().init();
        SpringApplication.run(SwaggerApplication.class, args);
    }
}


