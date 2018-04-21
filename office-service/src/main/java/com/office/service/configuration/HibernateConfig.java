package com.office.service.configuration;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.office.service.model.Task;

@Configuration
@EnableJpaRepositories("com.office.service")
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.office.service") })
public class HibernateConfig {

	@Autowired
	private ApplicationContext context;

	@Autowired
	private Environment environment;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();

		localSessionFactoryBean.setDataSource(getDataSource());
		localSessionFactoryBean.setPackagesToScan(new String[] { "com.office.service" });
		localSessionFactoryBean.setHibernateProperties(getHibernateProperties());

		localSessionFactoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		localSessionFactoryBean.setAnnotatedClasses(Task.class);

		return localSessionFactoryBean;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
		entityManagerFactoryBean.setDataSource(getDataSource());
		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan("com.office.service");

		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		

		entityManagerFactoryBean.setJpaProperties(properties);

		return entityManagerFactoryBean;
	}

//	@Bean
//	public HibernateTransactionManager getTransactionManager() {
//		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//
//		transactionManager.setSessionFactory(getSessionFactory().getObject());
//
//		return transactionManager;
//	}
//	
	
	@Bean
	@Qualifier(value = "transactionManager")
	public JpaTransactionManager getTransactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		
		transactionManager.setEntityManagerFactory(entityManagerFactory);
		
		return transactionManager;
	}

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/office_service");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgre");

		return dataSource;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();

		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);

		return properties;
	}

	public DataSource getDataSourceBackUp() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(environment.getRequiredProperty("hibernate.connection.driver_class"));
		dataSource.setUrl(environment.getRequiredProperty("hibernate.connection.url"));
		dataSource.setUsername(environment.getRequiredProperty("hibernate.connection.username"));
		dataSource.setPassword(environment.getRequiredProperty("hibernate.connection.password"));

		return dataSource;
	}

}
