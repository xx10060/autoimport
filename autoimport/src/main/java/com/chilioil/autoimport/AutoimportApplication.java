package com.chilioil.autoimport;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chilioil.autoimport.mapper")
public class AutoimportApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoimportApplication.class, args);
    }

}
