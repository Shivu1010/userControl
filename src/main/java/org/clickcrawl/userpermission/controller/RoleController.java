package org.clickcrawl.userpermission.controller;



import org.clickcrawl.userpermission.model.Role;
import org.clickcrawl.userpermission.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public Role createRole(@RequestBody Role role) {
        return roleService.save(role);
    }

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAll();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id) {
        return roleService.getById(id).orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @PutMapping("/{id}")
    public Role updateRole(@PathVariable Long id, @RequestBody Role role) {
        return roleService.update(id, role);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Long id) {
        roleService.delete(id);
    }
}

