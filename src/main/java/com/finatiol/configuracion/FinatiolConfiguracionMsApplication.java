package com.finatiol.configuracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FinatiolConfiguracionMsApplication {

    public static void main(String[] args) {

        SpringApplication.run(
                FinatiolConfiguracionMsApplication.class,
                args
        );
    }
}