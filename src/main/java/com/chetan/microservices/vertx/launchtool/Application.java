package com.chetan.microservices.vertx.launchtool;

import com.comcast.xhwholesale.template.vertx.foundation.BaseApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(
        basePackages = {
                "com.chetan.microservices.vertx.launchtool"
        }
)
public class Application extends BaseApplication {
    public static void main(String[] args) {
        startApplication( Application.class, args );
    }
}
