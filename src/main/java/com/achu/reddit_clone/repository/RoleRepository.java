package com.achu.reddit_clone.repository;

import com.achu.reddit_clone.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
