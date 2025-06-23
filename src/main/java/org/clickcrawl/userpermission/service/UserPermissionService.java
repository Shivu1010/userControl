package org.clickcrawl.userpermission.service;

import org.clickcrawl.userpermission.model.UserPermission;
import org.clickcrawl.userpermission.repository.UserPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserPermissionService {

    @Autowired
    private UserPermissionRepository userPermissionRepository;

    public UserPermission save(UserPermission userPermission) {
        return userPermissionRepository.save(userPermission);
    }

    public List<UserPermission> getAll() {
        return userPermissionRepository.findAll();
    }

    public Optional<UserPermission> getById(Long id) {
        return userPermissionRepository.findById(id);
    }

    public UserPermission update(Long id, UserPermission userPermission) {
        userPermission.setId(id);
        return userPermissionRepository.save(userPermission);
    }

    public void delete(Long id) {
        userPermissionRepository.deleteById(id);
    }
}

