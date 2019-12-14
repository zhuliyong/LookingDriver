package com.test.thread.testAsync;

import common.web.controller.UnitMethodController;
import common.web.service.UnitMethodService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 使用@Async 实现异步处理
 * 1、方法上添加 @Async
 * 2、启动类上增加@EnableAsync注解
 * @author peter
 * @version 1.1
 * @date 2019/12/12 14:40
 */
@RestController
@Slf4j
public class DemoController {

    @Autowired
    DemoService demoService;


   private static ApplicationContext  applicationContext;



    @GetMapping("test")
    public String testdemo(Integer count){
        System.out.println(Thread.currentThread().getName());
        long st = System.currentTimeMillis();
        demoService.method1(count);
        demoService.method2(count);
        long et = System.currentTimeMillis();
        System.out.println("===运行结束===="+(et-st));
        return "success";
    }

    @GetMapping("testmethod")
    public Integer testmethod(@RequestParam("n") Integer num){
        UnitMethodService  service = (UnitMethodService)applicationContext.getBean("UnitMethodService");
        System.out.println("=====收到："+num);
        return service.staticOrders(num);
    }




}
