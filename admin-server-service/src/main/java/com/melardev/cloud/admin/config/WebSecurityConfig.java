package com.melardev.cloud.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login").loginProcessingUrl("/login").permitAll();
        http.logout().logoutUrl("/logout");
        http.csrf().disable();

        http.authorizeRequests()
                .antMatchers("/login.html", "/**/*.css", "**/*.js", "/img/**", "/webjars/**", "/third-party/**")
                .permitAll();

        http
                .authorizeRequests()
                .antMatchers("/**").authenticated();

        http.httpBasic(); // Very important, Admin clients register themselves using Http Basic Authentication
    }
}
