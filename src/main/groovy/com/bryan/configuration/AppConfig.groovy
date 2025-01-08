package com.bryan.configuration

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfig {

    @Bean
    ModelMapper mapper() {
        new ModelMapper()
    }

}
