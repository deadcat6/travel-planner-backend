package com.flagcamp.travelplanner;

import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class ApplicationConfig {
    public DataSource dataSource() {
        String RDS_ENDPOINT = "travelplanner-db.cz7mrhkymu2y.us-east-1.rds.amazonaws.com";
        String USERNAME = "admin";
        String PASSWORD = "travelplannerdb";
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://" + RDS_ENDPOINT + ":3306/onlineOrder?createDatabaseIfNotExist=true&serverTimezone=UTC");
        dataSource.setUsername(USERNAME);
        dataSource.setPassword(PASSWORD);

        return dataSource;
    }
}
