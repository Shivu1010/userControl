package org.clickcrawl.userpermission.controller;

import org.clickcrawl.userpermission.model.RolePermission;
import org.clickcrawl.userpermission.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role-permissions")
public class RolePermissionController {

    @Autowired
    private RolePermissionService rolePermissionService;

    @PostMapping
    public RolePermission createRolePermission(@RequestBody RolePermission rolePermission) {
        return rolePermissionService.save(rolePermission);
    }

    @GetMapping
    public List<RolePermission> getAllRolePermissions() {
        return rolePermissionService.getAll();
    }

    @GetMapping("/{id}")
    public RolePermission getRolePermissionById(@PathVariable Long id) {
        return rolePermissionService.getById(id).orElseThrow(() -> new RuntimeException("Role Permission not found"));
    }

    @PutMapping("/{id}")
    public RolePermission updateRolePermission(@PathVariable Long id, @RequestBody RolePermission rolePermission) {
        return rolePermissionService.update(id, rolePermission);
    }

    @DeleteMapping("/{id}")
    public void deleteRolePermission(@PathVariable Long id) {
        rolePermissionService.delete(id);
    }
}

