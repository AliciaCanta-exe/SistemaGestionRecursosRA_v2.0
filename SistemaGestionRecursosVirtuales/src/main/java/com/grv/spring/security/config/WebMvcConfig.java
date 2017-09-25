package com.grv.spring.security.config;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
   private static final Charset UTF8 = Charset.forName("UTF-8");
 
   // Config UTF-8 Encoding.
   @Override
   public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
       StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
       stringConverter.setSupportedMediaTypes(Arrays.asList(new MediaType("text", "plain", UTF8)));
       converters.add(stringConverter);
 
       // Add other converters ...
   }
 
   // Static Resource Config
   // equivalents for <mvc:resources/> tags
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/css/**").addResourceLocations("/static/css/").setCachePeriod(31556926);
     //  registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
       registry.addResourceHandler("/img/**").addResourceLocations("/static/img/").setCachePeriod(31556926);
       registry.addResourceHandler("/js/**").addResourceLocations("/static/js/").setCachePeriod(31556926);
       registry.addResourceHandler("/font-awesome/**").addResourceLocations("/static/font-awesome/").setCachePeriod(31556926);
   }
 
   // Equivalent for <mvc:default-servlet-handler/> tag
   @Override
   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
   }
 
}
