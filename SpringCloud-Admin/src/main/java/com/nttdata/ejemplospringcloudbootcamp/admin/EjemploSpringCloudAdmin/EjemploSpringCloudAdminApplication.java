package com.nttdata.ejemplospringcloudbootcamp.admin.EjemploSpringCloudAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
@EnableAdminServer
@SpringBootApplication
public class EjemploSpringCloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploSpringCloudAdminApplication.class, args);
	}

}
