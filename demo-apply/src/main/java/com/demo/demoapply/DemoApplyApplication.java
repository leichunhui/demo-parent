package com.demo.demoapply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class DemoApplyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplyApplication.class, args);
    }

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
