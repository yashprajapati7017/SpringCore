package com.springCore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan
public class config {

    @Bean
    public DataSource getDataSourse(){

        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql//localhost:3306/SpringJdbc");
        ds.setUsername("root");
        ds.setPassword("@yashprajapati7017");
        return ds;
    }

    @Bean
    public JdbcTemplate getjdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSourse());
        return jdbcTemplate;
    }

}