package org.clickcrawl.userpermission.repository;

import org.clickcrawl.userpermission.model.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
}

