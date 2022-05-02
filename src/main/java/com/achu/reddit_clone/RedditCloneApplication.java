package com.achu.reddit_clone;

import com.achu.reddit_clone.config.SpringitProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class RedditCloneApplication {

//	@Autowired
//	private SpringitProperties springitProperties;

	public static void main(String[] args) {

		SpringApplication.run(RedditCloneApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner() {
//		return args -> {
//			System.out.println("Welcome message: "+ springitProperties.getWelcomeMsgs());
//		};
//	}

}
