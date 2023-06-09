package com.fanchen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fanchen.mapper")
public class SystemAdminJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemAdminJavaApplication.class, args);
    }

}
