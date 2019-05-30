package com.db.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 在此配置类中实现spring MVC 资源对象的整合
 */
@ComponentScan(value = "com.db",includeFilters = {  //只加载指定注解修饰的类
 @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class, ControllerAdvice.class})
},useDefaultFilters = false)
@EnableWebMvc//启用mvc默认配置
public class AppMvcConfig extends WebMvcConfigurerAdapter {
    /*视图解析器*/
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/pages/",".html");
    }
}
