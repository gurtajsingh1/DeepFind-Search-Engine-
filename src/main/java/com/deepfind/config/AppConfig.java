package com.deepfind.config;

import com.deepfind.index.InvertedIndex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InvertedIndex invertedIndex() {
        return new InvertedIndex();
    }
}
