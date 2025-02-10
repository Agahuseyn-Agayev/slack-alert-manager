package com.example.slackalertmanager.config;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Counter errorCounter(MeterRegistry meterRegistry) {
        return Counter.builder("http_500_error_total")
                .description("Number of HTTP 500 errors")
                .register(meterRegistry);
    }
}
