package org.clickcrawl.userpermission.controller;

import org.clickcrawl.userpermission.model.UserPermission;
import org.clickcrawl.userpermission.service.UserPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-permissions")
public class UserPermissionController {

    @Autowired
    private UserPermissionService userPermissionService;

    @PostMapping
    public UserPermission createUserPermission(@RequestBody UserPermission userPermission) {
        return userPermissionService.save(userPermission);
    }

    @GetMapping
    public List<UserPermission> getAllUserPermissions() {
        return userPermissionService.getAll();
    }

    @GetMapping("/{id}")
    public UserPermission getUserPermissionById(@PathVariable Long id) {
        return userPermissionService.getById(id).orElseThrow(() -> new RuntimeException("User Permission not found"));
    }

    @PutMapping("/{id}")
    public UserPermission updateUserPermission(@PathVariable Long id, @RequestBody UserPermission userPermission) {
        return userPermissionService.update(id, userPermission);
    }

    @DeleteMapping("/{id}")
    public void deleteUserPermission(@PathVariable Long id) {
        userPermissionService.delete(id);
    }
}

