package com.achu.reddit_clone;

import com.achu.reddit_clone.config.SpringitProperties;
import com.achu.reddit_clone.model.Comment;
import com.achu.reddit_clone.model.Link;
import com.achu.reddit_clone.repository.CommentRepository;
import com.achu.reddit_clone.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableConfigurationProperties(SpringitProperties.class)
@EnableJpaAuditing
public class RedditCloneApplication {

//	@Autowired
//	private SpringitProperties springitProperties;

	private static final Logger log = LoggerFactory.getLogger(RedditCloneApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(RedditCloneApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting started with clone of reddit", "https://redditClone");
			linkRepository.save(link);

			Comment comment = new Comment("This is exact copy of reddit", link);
			commentRepository.save(comment);

			link.addComment(comment);

		};
	}

}
