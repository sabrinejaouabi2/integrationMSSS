package com.esprit.msprojet.gestionproduits;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication



public class GestionProduitsApplication {



    public static void main(String[] args) {
        SpringApplication.run(GestionProduitsApplication.class, args);
    }


}
