package com.wusichao.config;

import com.wusichao.service.OutService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutServiceConfig {

    @Bean
    public OutService outService () {
        return new OutService();
    }
}
