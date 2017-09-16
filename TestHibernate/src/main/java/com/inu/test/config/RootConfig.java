package com.inu.test.config;

import java.util.Properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static org.hibernate.cfg.AvailableSettings.C3P0_ACQUIRE_INCREMENT;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_MAX_STATEMENTS;
import static org.hibernate.cfg.AvailableSettings.C3P0_MIN_SIZE;
import static org.hibernate.cfg.AvailableSettings.C3P0_TIMEOUT;
import static org.hibernate.cfg.Environment.*;
import com.inu.test.model.User;


@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScan(basePackages= {"com.inu.test.*"})
public class RootConfig {
	
	@Autowired
	private Environment env;
	
	@Bean 
	HibernateTemplate getHibernateTemplate() {
		return new HibernateTemplate(getSessionFactory().getObject());
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		Properties properties = new Properties();
		System.out.println(env.getProperty("mysql.driver"));
		properties.setProperty(DRIVER, env.getProperty("mysql.driver"));
		properties.setProperty(URL, env.getProperty("mysql.url"));
		properties.setProperty(USER, env.getProperty("mysql.user"));
		properties.setProperty(PASS, env.getProperty("mysql.password"));
		
		properties.setProperty(SHOW_SQL, env.getProperty("hibernate.show_sql"));
		properties.setProperty(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));
		
		  // Setting C3P0 properties
		properties.put(C3P0_MIN_SIZE, 
	            env.getProperty("hibernate.c3p0.min_size"));
		properties.put(C3P0_MAX_SIZE, 
	            env.getProperty("hibernate.c3p0.max_size"));
		properties.put(C3P0_ACQUIRE_INCREMENT,
	            env.getProperty("hibernate.c3p0.acquire_increment"));
		properties.put(C3P0_TIMEOUT, 
	            env.getProperty("hibernate.c3p0.timeout"));
		properties.put(C3P0_MAX_STATEMENTS, 
	            env.getProperty("hibernate.c3p0.max_statements"));

		factoryBean.setHibernateProperties(properties);
		factoryBean.setAnnotatedClasses(User.class);
		return factoryBean;
	}
	
	 @Bean
	 public HibernateTransactionManager getTransactionManager() {
	      HibernateTransactionManager transactionManager = new HibernateTransactionManager();
	      transactionManager.setSessionFactory(getSessionFactory().getObject());
	      return transactionManager;
	   }
	

}
