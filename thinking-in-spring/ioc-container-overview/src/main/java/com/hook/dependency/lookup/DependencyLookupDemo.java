package com.hook.dependency.lookup;

import com.hook.annotation.Super;
import com.hook.domain.User;
import com.hook.template.IService;
import com.hook.template.impl.OneService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description 依赖查找demo
 * Author hebaokai
 * Date 2022/12/6 10:58
 *
 * @Version 1.0
 *
 * 根据Bean名称查找
 *   实时查找
 *   延迟查找：ObjectFactory
 *
 * 根据Bean类型查找
 *   单个Bean
 *   集合Bean
 *
 * 根据Bean名称+类型查找
 *
 * 根据Java注解查找
 *    单个Bean
 *    集合Bean
 *
 **/
public class DependencyLookupDemo {


    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:META-INF/dependency-lookup.xml");
        //实时查找
        lookupInRealTime(beanFactory);
        lookupInLazy(beanFactory);
        getService(beanFactory);

        lookupByAnnotation(beanFactory);
    }

    private static void lookupByAnnotation(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory lbf = (ListableBeanFactory) beanFactory;
            System.out.println("根据注解获取bean"+lbf.getBeansWithAnnotation(Super.class));
        }
    }

    private static void lookupInRealTime(BeanFactory beanFactory) {
        System.out.println(beanFactory.getBean("user"));
    }

    private static void lookupInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>)beanFactory.getBean("objectFactory");
        System.out.println("lazy:"+objectFactory.getObject());
    }

    private static void getService(BeanFactory beanFactory) {

        IService bean = beanFactory.getBean(OneService.class);
        System.out.println(bean);
        if (beanFactory instanceof ListableBeanFactory) {
            System.out.println(((ListableBeanFactory) beanFactory).getBeansOfType(IService.class));
        }

    }


}
