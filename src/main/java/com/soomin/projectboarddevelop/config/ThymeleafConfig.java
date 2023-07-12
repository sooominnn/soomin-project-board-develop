package com.soomin.projectboarddevelop.config;

import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;

/**
 * fileName     : ThymeleafConfig
 * author       : lia
 * date         : 2023/07/01
 * description  : ThymeleafConfig
 * ===========================================================
 * DATE            AUTHOR         NOTE
 * -----------------------------------------------------------
 * 2023/07/01       lia          최초 생성
 */
@Configuration
public class ThymeleafConfig {

    @Bean
    public SpringResourceTemplateResolver thymeleafTemplateResolver(
            SpringResourceTemplateResolver defaultTemplateResolver,
            ThymeleafProperties thymeleafProperties
    ) {
//        defaultTemplateResolver.setUseDecoupledLogic(thymeleafProperties.);

        return defaultTemplateResolver;
    }
}
