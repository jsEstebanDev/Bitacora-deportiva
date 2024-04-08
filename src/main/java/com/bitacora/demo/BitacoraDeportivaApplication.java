package com.bitacora.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BitacoraDeportivaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BitacoraDeportivaApplication.class, args);
	}
	@GetMapping("/")
	public String home(){
		return "index";
	}
}
