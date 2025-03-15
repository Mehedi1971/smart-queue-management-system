package com.mahedi.smartqueuemanagementsystem.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMopperConfig {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
