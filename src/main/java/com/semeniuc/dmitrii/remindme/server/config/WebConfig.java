package com.semeniuc.dmitrii.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Dmitrii on 8/21/2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.semeniuc.dmitrii.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{

}
