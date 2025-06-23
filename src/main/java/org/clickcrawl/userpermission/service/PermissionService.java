package org.clickcrawl.userpermission.service;


import org.clickcrawl.userpermission.model.Permission;
import org.clickcrawl.userpermission.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public Permission save(Permission permission) {
        return permissionRepository.save(permission);
    }

    public List<Permission> getAll() {
        return permissionRepository.findAll();
    }

    public Optional<Permission> getById(Long id) {
        return permissionRepository.findById(id);
    }

    public Permission update(Long id, Permission permission) {
        permission.setId(id);
        return permissionRepository.save(permission);
    }

    public void delete(Long id) {
        permissionRepository.deleteById(id);
    }
}

