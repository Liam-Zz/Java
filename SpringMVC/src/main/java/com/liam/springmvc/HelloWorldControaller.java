package com.liam.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller注解标识当前类是一个处理器
@Controller
public class HelloWorldControaller {

    //@RequestMapping注解设置该方法处理的请求路径
    @RequestMapping("/")
    public String goIndex(){
        System.out.println("首页");
        //返回值会被SpringMVC配置文件中配置的ThymeleafViewResolver解析为一个真实的物理视图
        return "index";
    }

    //@RequestMapping注解设置该方法处理的请求路径
    @RequestMapping("/hello_world")
    public String hello_world(){
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
