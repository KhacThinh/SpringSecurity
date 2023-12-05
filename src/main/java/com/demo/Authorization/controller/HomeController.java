package com.demo.Authorization.controller;

import com.demo.Authorization.model.Role;
import com.demo.Authorization.model.User;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin("*")
public class HomeController {

    @GetMapping("/welcome")
    public String welcome() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && !(authentication instanceof AnonymousAuthenticationToken)) {
            if (authentication.getPrincipal() instanceof User) {
                Set<Role> roles = Optional.of((User) authentication.getPrincipal()).get().getRoles();
                String abc = "";
                for (Role role : roles) {
                    abc += role.getRole();
                }
                return "Welcome to" + abc;
            }
        }
        return "không đăng nhập được"; // Nếu không có người dùng được xác thực, chuyển hướng đến trang đăng nhập

    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/user")
    public String user() {
        return "welcome to user";
    }

    @GetMapping("/admin")
    public String admin() {
        return "welcome to admin";
    }

    @GetMapping("/authentication")
    public String authentication() {
        return "authentication";
    }
}
