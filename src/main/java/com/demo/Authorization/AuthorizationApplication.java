package com.demo.Authorization;

import com.demo.Authorization.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
//@EnableWebSecurity
//@EnableJpaRepositories
public class AuthorizationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationApplication.class, args);
    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    CommandLineRunner runner(UserService userService) {
//        return args -> {
////            userService.addRole(new Role("USER"));
////            userService.addRole(new Role("ADMIN"));
////            userService.addRole(new Role("MANAGER"));
////
////            userService.addUser(new User("nhat96@gmail.com", "Hai Duong", passwordEncoder().encode("12345"), new HashSet<>()));
////            userService.addUser(new User("mai03@gmail.com", "Hai Duong", passwordEncoder().encode("12345"), new HashSet<>()));
////            userService.addUser(new User("thinh03@gmail.com", "Hai Duong", passwordEncoder().encode("12345"), new HashSet<>()));
////            userService.addUser(new User("huyen82@gmail.com", "Hai Duong", passwordEncoder().encode("12345"), new HashSet<>()));
//
//            userService.addRoleToUser("nhat96@gmail.com", "USER");
//            userService.addRoleToUser("mai03@gmail.com", "USER");
//            userService.addRoleToUser("mai03@gmail.com", "ADMIN");
//            userService.addRoleToUser("thinh03@gmail.com", "ADMIN");
//        };
//    }

}
