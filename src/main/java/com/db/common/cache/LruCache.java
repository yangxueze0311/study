package com.db.common.cache;

import org.springframework.stereotype.Component;

/**
 * 假设此类是一个缓存对象
 * 此对象基于LRU算法
 * LRU算法：最近最少用算法
 */
@Component//等效于@Controller,@Service,用于修饰一般组件对象，他的含义类似于
//<bean id="lruCache" class="com.db.common.cache.LruCache" />
public class LruCache {

}
