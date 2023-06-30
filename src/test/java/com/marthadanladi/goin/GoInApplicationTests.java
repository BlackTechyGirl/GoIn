package com.marthadanladi.goin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class GoInApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testDatabaseConnection(){
        DriverManagerDataSource dataSource =
                new DriverManagerDataSource("jdbc:mysql://127.0.0.1:3306/GoinDb");
        try {
            Connection connection = dataSource.getConnection("Martha", "DrDanladi@@2020");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
