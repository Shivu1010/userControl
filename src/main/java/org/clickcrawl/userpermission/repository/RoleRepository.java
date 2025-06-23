package org.clickcrawl.userpermission.repository;

import org.clickcrawl.userpermission.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
