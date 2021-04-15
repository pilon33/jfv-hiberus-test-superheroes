package jfv.hiberus.superheroes.challenge.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableGlobalMethodSecurity(
  securedEnabled = true)
@EnableWebSecurity
public class MethodSecurityConfig extends GlobalMethodSecurityConfiguration {
	
}
