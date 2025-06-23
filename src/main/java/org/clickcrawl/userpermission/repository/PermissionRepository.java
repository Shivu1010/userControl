package org.clickcrawl.userpermission.repository;

import org.clickcrawl.userpermission.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}

