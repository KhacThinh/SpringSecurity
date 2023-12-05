//package com.demo.Authorization.config;
//
//import com.demo.Authorization.model.User;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class UserInfoUserDetails implements UserDetails {
//
//    private String email;
//    private String password;
//    private List<GrantedAuthority> grantedAuthorities;
//
//    public UserInfoUserDetails(User user) {
//        email = user.getEmail();
//        password = user.getPassword();
//        String roles = user.getRoles().toString();
//        roles = roles.replace("[", "");
//        roles = roles.replace("]", "");
//        grantedAuthorities = Arrays.stream(roles.split(","))
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return grantedAuthorities;
//    }
//
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    @Override
//    public String getUsername() {
//        return email;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
