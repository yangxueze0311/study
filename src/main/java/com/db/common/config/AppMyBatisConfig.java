package com.db.common.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration//通过注解声明这是配置文件（配置类）
public class AppMyBatisConfig {

    //假如bean没有指定名字，此bean的默认名字为方法名
    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean newSqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean fBean = new SqlSessionFactoryBean();
        fBean.setDataSource(dataSource);
        Resource[] mapperLocations = new PathMatchingResourcePatternResolver()
         .getResources("classpath:mapper/sys/*.xml");
        fBean.setMapperLocations(mapperLocations);
        return fBean;
    }
}
