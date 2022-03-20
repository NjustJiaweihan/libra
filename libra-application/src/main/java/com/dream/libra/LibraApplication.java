package com.dream.libra;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.dream.libra.dao")
public class LibraApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibraApplication.class, args);
    }

}
