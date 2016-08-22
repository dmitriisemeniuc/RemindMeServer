package com.semeniuc.dmitrii.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

/**
 * Created by Dmitrii on 8/22/2016.
 */
@Configuration
@EnableJpaRepositories("com.semeniuc.dmitrii.remindme.server.repository")
@EnableTransactionManagement
@ComponentScan("com.semeniuc.dmitrii.remindme.server")
@PropertySource("classpath:db.properties")
public class DatabaseConfig {

    @Resource
    private Environment env;

}
