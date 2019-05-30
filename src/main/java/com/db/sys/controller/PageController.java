package com.db.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//系统底层发现@RequestMapping注解后会找到一个
// HandlerMapping对象（具备全局唯一性），此对象内部对应的是一个map，勇于存储url到具体方法的映射
//说明在springMVC中会将@Controller注解的类理解为Handler对象
@RequestMapping("/")
@Controller//<bean id="" class="" />
public class PageController {//类加载（将类读到内存）

    /**
     * 通过此方法返回系统的首页页面
     * @return
     */
    @RequestMapping("doIndexUI")
    public  String doIndexUI() {
        return "starter";//WEB-INF/pages/starter.html
    }
}
