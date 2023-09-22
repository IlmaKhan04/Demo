package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevOpsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsAssignmentApplication.class, args);
	}

	// Bug: Missing error handling
	public void someMethod() {
		// Code without proper error handling
	}

	// Vulnerability: Hardcoded secrets
	private String secretKey = "mySecretKey";

	// Code Smell: Unused variable
	private int unusedVariable;

	// Security Hotspot: Sensitive information exposure
	public void displayErrorMessage(String message) {
		// Logging sensitive information
		System.out.println("Error message: " + message);
	}
}
