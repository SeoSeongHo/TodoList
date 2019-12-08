package com.todo.config

import org.springframework.context.annotation.Bean
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

class SecurityConfig : WebSecurityConfigurerAdapter() {
    @Bean
    override fun authenticationManagerBean(): AuthenticationManager {
        return super.authenticationManagerBean()
    }

    override fun configure(http: HttpSecurity) {
        http
                .csrf().disable()
                .antMatcher("/api/**").authorizeRequests()
                .antMatchers("/api/**").anonymous()
                .anyRequest().authenticated()
                .and()
    }
}