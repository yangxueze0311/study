package com.test;

import com.db.common.cache.LruCache;
import com.db.common.config.AppRootConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBase {

    protected AnnotationConfigApplicationContext atx;
    @Before
    public void  init() {
        //基于AppRootConfig中的配置初始化spring容器
       atx =  new AnnotationConfigApplicationContext(AppRootConfig.class);
    }

    @Test
    public void textSpingFw() {
        System.out.println(atx);
    }
    @Test
    public void testLruCache() {
        LruCache lru = atx.getBean("lruCache",LruCache.class);
        System.out.println(lru);
    }
    @After
    public void close() {
        atx.close();
    }
}
