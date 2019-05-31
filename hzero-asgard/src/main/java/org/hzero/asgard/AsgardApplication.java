package org.hzero.asgard;

import org.hzero.autoconfigure.asgard.EnableHZeroAsgard;
import io.choerodon.eureka.event.EurekaEventHandler;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableHZeroAsgard
@EnableDiscoveryClient
@SpringBootApplication
public class AsgardApplication {

    public static void main(String[] args) {
        EurekaEventHandler.getInstance().init();
        SpringApplication.run(AsgardApplication.class, args);
    }
}


