package com.test;

import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestDataSource extends TestBase {
    @Test
    public void testDruidDataSource() throws SQLException {
        DataSource ds = atx.getBean("dataSource",DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
