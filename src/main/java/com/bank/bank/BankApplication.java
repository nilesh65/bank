package com.bank.bank;

import com.bank.bank.notification.services.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@RequiredArgsConstructor
public class BankApplication {
    private final NotificationService notificationService;
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}
