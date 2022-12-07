package com.hook.dependency.injection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description 依赖注入Demo
 * Author hebaokai
 * Date 2022/12/6 14:46
 *
 * 依赖注入：将bean注入到Bean里面去？
 *
 * @Version 1.0
 **/
public class DependencyInjectionDemo {


    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency-lookup.xml");


    }
}
