package com.demo.Authorization.service;

import com.demo.Authorization.model.Role;
import com.demo.Authorization.model.User;
import com.demo.Authorization.repository.RoleRepository;
import com.demo.Authorization.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    public User addUser(User user) {
        return userRepository.save(user);
    }

    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    public void addRoleToUser(String email, String nameRole) {
        User user = userRepository.findUserByEmail(email).get();
        Hibernate.initialize(user.getRoles());
        Role role = roleRepository.findRoleByName(nameRole).orElseThrow(()-> new IllegalArgumentException("Khong tim thay"));
        user.addRole(role);
    }
}
