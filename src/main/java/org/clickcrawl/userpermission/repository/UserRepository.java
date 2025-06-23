package org.clickcrawl.userpermission.repository;

import org.clickcrawl.userpermission.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
