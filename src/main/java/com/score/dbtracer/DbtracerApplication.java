package com.score.dbtracer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@ComponentScan(basePackages = { Constants.PKG_PREFIX })
@Slf4j
public class DbtracerApplication {

    public static void main(String[] args) {
        log.info("Start");
        SpringApplication.run(DbtracerApplication.class, args);
    }

}
