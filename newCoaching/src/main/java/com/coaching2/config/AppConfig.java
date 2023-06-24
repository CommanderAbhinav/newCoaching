package com.coaching2.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.coaching2"})
public class AppConfig {
   
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
	return viewResolver;
      }
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		
		JdbcTemplate jdbcTemplate =new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	
	public DataSource dataSource() {
		
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
		
		dataSource.setUsername("root");
		dataSource.setPassword("abhinav01");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/newCoaching?useSSL=false");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
		
		
	}
}
