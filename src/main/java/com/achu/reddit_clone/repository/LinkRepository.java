package com.achu.reddit_clone.repository;

import com.achu.reddit_clone.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LinkRepository extends JpaRepository<Link, Long> {

}
