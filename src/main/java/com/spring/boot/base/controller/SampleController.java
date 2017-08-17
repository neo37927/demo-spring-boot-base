package com.spring.boot.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by xiaolin on 2017/8/17.
 */
@RestController
//@EnableAutoConfiguration
public class SampleController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String home() {
        logger.debug("debug");
        logger.info("info");
        logger.error("error");
        logger.warn("warn");
        logger.trace("trace");
        return "Hello World!";
    }
}