package com.lyun.rest.webservices.restfulwebservices.security;

import static org.springframework.security.config.Customizer.withDefaults;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		필터 체인
//		1) 모든 요청이 인증되어야 함.
		http.authorizeHttpRequests(
				auth -> auth.anyRequest().authenticated()
				);
//		2) 기본값으로 웹페이지가 표시
		http.httpBasic(withDefaults());
		
//		3) 필터 체인에서 수행되는 것 중 하나가 CSRF 확인할 수 있는 설정
		http.csrf().disable();
		
		return http.build();
		
	}
}
