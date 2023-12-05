//package com.demo.Authorization.config;
//
//import com.demo.Authorization.model.User;
//import com.demo.Authorization.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class UserInfoDetailService implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> user = userRepository.findUserByEmail(username);
//        // UserInfoUserDetail::new là map(info -> new UserInfoUserDetail(info))
//        return user.map(UserInfoUserDetails::new)
//                .orElseThrow(() -> new UsernameNotFoundException("not found " + username));
//    }
//}
