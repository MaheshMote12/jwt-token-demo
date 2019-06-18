package com.example.me;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class JtwTokenCreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JtwTokenCreationApplication.class, args);
	}

	 @Bean
	    public CorsFilter corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//	        CorsConfiguration config = jHipsterProperties.getCors();
//	        if (config.getAllowedOrigins() != null && !config.getAllowedOrigins().isEmpty()) {
//	            log.debug("Registering CORS filter");
//	            source.registerCorsConfiguration("/api/**", config);
//	            source.registerCorsConfiguration("/management/**", config);
//	            source.registerCorsConfiguration("/v2/api-docs", config);
//	        }
	        return new CorsFilter(source);
	    }
}
