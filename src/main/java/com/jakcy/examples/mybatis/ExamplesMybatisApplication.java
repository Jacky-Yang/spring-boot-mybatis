package com.jakcy.examples.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.jakcy.examples.mybatis.generator.mapper"})
public class ExamplesMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamplesMybatisApplication.class, args);
    }

}
