package com.spring.boot.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by xiaolin on 2017/8/18.
 */
@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan
public class SpringBootBaseApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootBaseApplication.class, args);
    }
}
