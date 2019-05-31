package org.hzero.iam;

import org.hzero.autoconfigure.iam.EnableHZeroIam;
import io.choerodon.eureka.event.EurekaEventHandler;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHZeroIam
@EnableDiscoveryClient
@SpringBootApplication
public class IamApplication {

    public static void main(String[] args) {
        EurekaEventHandler.getInstance().init();
        SpringApplication.run(IamApplication.class, args);
    }
}


