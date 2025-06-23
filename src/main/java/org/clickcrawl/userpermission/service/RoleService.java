package org.clickcrawl.userpermission.service;


import org.clickcrawl.userpermission.model.Role;
import org.clickcrawl.userpermission.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> getAll() {
        return roleRepository.findAll();
    }

    public Optional<Role> getById(Long id) {
        return roleRepository.findById(id);
    }

    public Role update(Long id, Role role) {
        role.setId(id);
        return roleRepository.save(role);
    }

    public void delete(Long id) {
        roleRepository.deleteById(id);
    }
}

