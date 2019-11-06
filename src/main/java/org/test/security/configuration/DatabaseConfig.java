package org.test.security.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;


@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUsername("user");
        dataSource.setPassword("password");
        dataSource.setUrl("jdbc:mysql://host:3306/testdb?useSSL=false");
        return dataSource;

    }
}
