package com.sailes.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		System.out.print(s.nextInt()*2);
		Scanner s = new Scanner(System.in);
		System.out.print(s.nextInt()*2);
		System.out.print(s.nextLine());
	}



}
