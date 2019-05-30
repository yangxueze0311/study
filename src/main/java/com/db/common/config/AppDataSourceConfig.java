package com.db.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * 相关数据源的配置
 */
//系统底层读取properties是会将内容封装到Envionment对象
@PropertySource("classpath:configs.properties")
@Configuration
public class AppDataSourceConfig {

    /*系统底层会将@Bean注解修饰的方法创建的对象交给spring框架管理*/
    @Bean(value = "dataSource" )//等效于<bean id="" class="" />
    public DataSource newDruidDataSource(Environment env) {
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(env.getProperty("jdbcDriver"));
        ds.setUrl(env.getProperty("jdbcUrl"));
        ds.setUsername(env.getProperty("jdbcUser"));
        ds.setPassword(env.getProperty("jdbcPassword"));
        return ds;
    }
}
