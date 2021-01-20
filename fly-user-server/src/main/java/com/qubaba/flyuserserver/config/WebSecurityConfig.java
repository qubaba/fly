package com.qubaba.flyuserserver.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.nio.charset.StandardCharsets;

/**
 * @author QuPeng
 * @date 2021/1/18 10:46
 * @Desc
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger log = LoggerFactory.getLogger(WebSecurityConfig.class);

    @Bean
    PasswordEncoder passwordEncoder() {
        return new PasswordEncoder() {

            @Override
            public String encode(CharSequence charSequence) {
                return String.valueOf(charSequence);
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                log.info("加密过得密码:{}", charSequence);
                log.info("未加密密码:{}", charSequence);
                return true;
            }
        };
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginProcessingUrl("/login")
                .loginPage("/login.html")
                .permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/static/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()

                .csrf().disable()
        ;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password(passwordEncoder().encode("123456"))
                .roles("ADMIN");
        super.configure(auth);
    }
}
