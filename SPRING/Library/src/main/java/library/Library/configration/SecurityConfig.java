//package library.Library.configration;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//@EnableMethodSecurity(prePostEnabled = true)
//@RequiredArgsConstructor
//public class SecurityConfig {
//
//    private final DataSource dataSource;
//
//    // Password encoder bean using BCrypt
//    @Bean
//    public static BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    // UserDetailsService bean for loading users from the database
//    @Bean
//    public UserDetailsService userDetailsService() {
//        JdbcDaoImpl jdbcDao = new JdbcDaoImpl();
//        jdbcDao.setDataSource(dataSource);
//        return jdbcDao;
//    }
//
//    // Authentication provider that uses the UserDetailsService and PasswordEncoder
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        authProvider.setUserDetailsService(userDetailsService());
//        authProvider.setPasswordEncoder(passwordEncoder()); // use password encoder
//        return authProvider;
//    }
//
//    // Security filter chain to define access rules
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.csrf().disable() // Disable CSRF for simplicity (in production, configure it properly)
//                .authorizeRequests()
//                .requestMatchers("/swagger-ui/**", "/v3/api-docs/**",
//                        "/swagger-resources/**", "/webjars/**").permitAll() // Allow access to Swagger without auth
//                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll() // Permit OPTIONS requests
//                .requestMatchers(HttpMethod.POST, "/users/register").permitAll()
//                .requestMatchers("/users/**").hasRole("USER")// Allow user registration without authentication
//                .requestMatchers(HttpMethod.GET, "/books").permitAll() // Allow public access to book listings
//                .anyRequest().authenticated() // All other endpoints require authentication
//                .and()
//                .httpBasic() // Enable basic authentication
//                .and()
//                .build();
//    }
//}
