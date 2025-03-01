package com.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.platform.controller",
		                                   "com.platform.configuration",
											"com.platform.entity",
											"com.platform.repository",
											"com.platform.request",
											"com.platform.response",
											"com.platform.service"})
public class TicketBookingApplication {
	/*
	Test method added
	 */
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingApplication.class, args);
	}
}
