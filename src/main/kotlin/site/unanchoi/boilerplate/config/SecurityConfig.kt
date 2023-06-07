package site.unanchoi.boilerplate.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain
import org.springframework.security.config.annotation.web.builders.HttpSecurity

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity) : SecurityFilterChain {
        return http
            .csrf().disable()
            .formLogin().disable()
            .authorizeHttpRequests()
            .anyRequest().permitAll()
            .and()
            .build();
    }
}