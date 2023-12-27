package org.example;

import org.example.functions.FunctionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public FunctionManager functionManager() {
        return new FunctionManager();
    }
}
