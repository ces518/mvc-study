package me.june.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Spring Application Config (Application Context)
 *
 * Controller 제외한 등록
 */
@Configuration
@ComponentScan(basePackages="me.june.mvc", excludeFilters = @ComponentScan.Filter(Controller.class))
public class ApplicationConfig {

}
