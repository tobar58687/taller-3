package com.tallertres.tallertresmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import dto.repositoriointerface;
import src.main.java.dto.orden;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class TallerTresMongoApplication implements CommandLineRunner {
	@Autowired
    repositoriointerface repositorio;
	public static void main(String[] args) {
		SpringApplication.run(TallerTresMongoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		repositorio.save(new orden("1", "efectivo", "calle 32 sur 20-19", "CaliesCaliLoDemas es loma"));
	}
}
