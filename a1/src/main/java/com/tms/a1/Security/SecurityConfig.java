package com.tms.a1.Security;

// import org.springframework.context.annotation.Configuration;

// import lombok.AllArgsConstructor;

// @Configuration
// @AllArgsConstructor
// public class SecurityConfig {

//     private final customAuthenticationManager customAuthenticationManager;

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         AuthenticationFilter authenticationFilter = new AuthenticationFilter(customAuthenticationManager);
//         authenticationFilter.setFilterProcessesUrl("/authenticate");
//         http        
//             .headers().frameOptions().disable() // New Line: the h2 console runs on a "frame". By default, Spring Security prevents rendering within an iframe. This line disables its prevention.
//             .and()
//             .csrf().disable()
//             .authorizeRequests()  
//             .antMatchers("/h2/**").permitAll() // New Line: allows us to access the h2 console without the need to authenticate. ' ** '  instead of ' * ' because multiple path levels will follow /h2.
//             .antMatchers(HttpMethod.POST, SecurityConstants.REGISTER_PATH).permitAll()
//             .anyRequest().authenticated()
//             .and()
//             .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
//             .addFilter(authenticationFilter)
//             .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
//             .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//         return http.build();
//     }
    
// }