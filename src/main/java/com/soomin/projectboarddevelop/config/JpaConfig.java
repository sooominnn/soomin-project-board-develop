package com.soomin.projectboarddevelop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

/**
 * fileName     : JpaConfig
 * author       : lia
 * date         : 2023/06/27
 * description  : JpaConfig
 * ===========================================================
 * DATE            AUTHOR         NOTE
 * -----------------------------------------------------------
 * 2023/06/27       lia          최초 생성
 */
@EnableJpaAuditing
@Configuration
public class JpaConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("soo"); //TODO : 스프링 시큐리티로 인증 기능 붙이면 수정!
    }
}
