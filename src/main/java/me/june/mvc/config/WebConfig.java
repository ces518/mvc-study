package me.june.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Servlet Context Config
 *
 * Only Controller Config
 */
@Configuration
@ComponentScan(basePackages = "me.june.mvc")
/**
 * Spring mvc 의 설정들을 편하게 할수있는 annotation
 *
 * DelegatingWebMvcConfiguration 을 import하여
 * RequestMappingHandlerMapping , Adapter , Interceptor, MessageConverter 등 의 설정을 런타임시 설정해준다.
 */
@EnableWebMvc
public class WebConfig {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
