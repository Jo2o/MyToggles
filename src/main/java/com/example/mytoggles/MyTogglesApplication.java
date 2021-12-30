package com.example.mytoggles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MyTogglesApplication {

    public static void main(String[] args) {
        log.info(">>>>>>>>>>>>>>>> STARTING");
        SpringApplication.run(MyTogglesApplication.class, args);
    }

}
