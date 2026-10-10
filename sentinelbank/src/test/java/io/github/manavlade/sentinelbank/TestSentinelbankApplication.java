package io.github.manavlade.sentinelbank;

import org.springframework.boot.SpringApplication;

public class TestSentinelbankApplication {

	public static void main(String[] args) {
		SpringApplication.from(SentinelbankApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
