package org.clickcrawl.userpermission.service;

import org.clickcrawl.userpermission.model.RolePermission;
import org.clickcrawl.userpermission.repository.RolePermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolePermissionService {

    @Autowired
    private RolePermissionRepository rolePermissionRepository;

    public RolePermission save(RolePermission rolePermission) {
        return rolePermissionRepository.save(rolePermission);
    }

    public List<RolePermission> getAll() {
        return rolePermissionRepository.findAll();
    }

    public Optional<RolePermission> getById(Long id) {
        return rolePermissionRepository.findById(id);
    }

    public RolePermission update(Long id, RolePermission rolePermission) {
        rolePermission.setId(id);
        return rolePermissionRepository.save(rolePermission);
    }

    public void delete(Long id) {
        rolePermissionRepository.deleteById(id);
    }
}

