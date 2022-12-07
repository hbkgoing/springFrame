package com.hook;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.SpringApplication;

/**
 * Description TODO
 * Author hebaokai
 * Date 2022/12/7 09:26
 *
 * @Version 1.0
 **/

@SpringBootApplication
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
