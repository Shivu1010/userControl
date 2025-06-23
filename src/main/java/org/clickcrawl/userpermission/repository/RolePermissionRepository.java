package org.clickcrawl.userpermission.repository;

import org.clickcrawl.userpermission.model.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
}

