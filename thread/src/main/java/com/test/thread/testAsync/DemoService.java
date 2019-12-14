package com.test.thread.testAsync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


/**
 * @author peter
 * @version 1.1
 * @date 2019/12/12 14:41
 */
@Slf4j
@Service
public class DemoService {

    @Async
    public void  method1( int count){
        System.out.println("开始执行 method1====="+Thread.currentThread().getName());
        int sum = 0;
        Long st = System.currentTimeMillis();
        for(int i = 0;i<count;i++){
            sum += i;
        }
        Long et = System.currentTimeMillis();
        System.out.println("method1耗时："+ (et-st));
    }


    public void method2(int count){
        System.out.println("开始执行 method2======="+Thread.currentThread().getName());
        int sum = 0;
        Long st = System.currentTimeMillis();
        for(int i = 0;i<count;i++){
            sum += i;
        }
        Long et = System.currentTimeMillis();
        System.out.println("method2耗时："+ (et-st));
    }


}
