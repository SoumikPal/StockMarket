package com.stock.stockmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@SpringBootApplication
@EnableWebMvc
public class StockmarketApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(StockmarketApplication.class, args);
	}
	 @Override
     public void addCorsMappings(CorsRegistry registry) {
         registry.addMapping("/**");
     }
     @Bean
	 public CorsFilter corsFilter() {
         final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
         final CorsConfiguration config = new CorsConfiguration();
         config.setAllowCredentials(true);
         config.addAllowedOrigin("*");
         config.addAllowedHeader("*");
             config.addAllowedMethod("GET");
             config.addAllowedMethod("POST");
             config.addAllowedMethod("DELETE");
             config.addAllowedMethod("PUT");
             config.setMaxAge(18000L);
         source.registerCorsConfiguration("/**", config);
         return new CorsFilter(source);
     }

}