package com.db.common.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/***
 * tomcat启动时会加载此类，然后执行相关方法
 */

public class AppWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses()");
        return new Class[]{AppRootConfig.class};
    }

//    官方建议在此方法中加载View,Controller
    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses()");
        return new Class[]{AppMvcConfig.class};
    }

   //官方建议在此方法中定义请求映射
    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletConfigClasses()");
        return new String[]{"*.do"};
    }
}
