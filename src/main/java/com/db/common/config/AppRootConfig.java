package com.db.common.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * 项目中对系统资源对象配置的两种方式：
 * 1）基于xml
 * 2）基于annotation(注解):jdk1.5新特性
 *
 * 注解配置说明：
 * @CompontScan 修饰配置类，用于定义要对哪些包中的类型进行扫描，属性value
 * 指定具体的要扫描的包，属性excludeFilters表示对扫描包中的哪些类不进行加载
 */
@ComponentScan(value = "com.db",excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
 classes = {Controller.class, ControllerAdvice.class})})
public class AppRootConfig {

}
