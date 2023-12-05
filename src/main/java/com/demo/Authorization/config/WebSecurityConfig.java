//package com.demo.Authorization.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import static org.springframework.security.config.Customizer.withDefaults;
//
//@EnableWebSecurity
//@Configuration
//@EnableMethodSecurity
//public class WebSecurityConfig {
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//
//    @Bean
//    public UserDetailsService userDetailsService() {
////        UserDetails user = User.withUsername("mai03@gmail.com")
////                .password(passwordEncoder().encode("12345"))
////                .roles("USER")
////                .build();
////        UserDetails admin = User.withUsername("thinh03@gmail.com")
////                .password(passwordEncoder.encode("12345"))
////                .roles("USER", "ADMIN")
////                .build();
////        return new InMemoryUserDetailsManager(user, admin);
//        return new UserInfoDetailService();
//    }
//
//    @Bean
//    public AuthenticationProvider authenticationManager() {
//        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//        daoAuthenticationProvider.setUserDetailsService(userDetailsService());
//        daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//        return daoAuthenticationProvider;
//    }
//
////    @Bean
////    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
////        http.csrf(csrf -> csrf.disable())
////                .authorizeHttpRequests(registry -> registry
////                        .requestMatchers("/admin").hasRole("ADMIN")
////                        .requestMatchers("/user").hasAnyRole("USER", "ADMIN")
////                        .requestMatchers("/authentication").authenticated()
////                        .anyRequest().permitAll()
////                )
////                .httpBasic(withDefaults());
////
////        return http.build();
////    }
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/admin").hasRole("ADMIN")
//                .and()
//                .authorizeHttpRequests().requestMatchers("/authentication")
//                .authenticated().and().formLogin().and().build();
//    }
//
//}
////        http.formLogin()
////                .loginPage("/login") // URL của trang đăng nhập
////                .loginProcessingUrl("/perform_login") // URL xử lý đăng nhập
////                .defaultSuccessUrl("/home") // URL mặc định sau khi đăng nhập thành công
////                .failureUrl("/login?error=true") // URL khi đăng nhập thất bại
////                .permitAll(); // Cho phép tất cả mọi người truy cập trang đăng nhập
