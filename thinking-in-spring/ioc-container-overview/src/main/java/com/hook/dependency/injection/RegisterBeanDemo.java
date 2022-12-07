package com.hook.dependency.injection;

import com.hook.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Description 编码方式注入bean
 * Author hebaokai
 * Date 2022/12/7 17:01
 *
 * @Version 1.0
 **/
public class RegisterBeanDemo {


    public static void main(String[] args) {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanFactory beanFactory1 = bindViaCode(beanFactory);
        System.out.println(beanFactory1.getBean("user"));
        System.out.println(beanFactory.getBean("user"));

    }

    private static BeanFactory bindViaCode(BeanDefinitionRegistry registry) {

        AbstractBeanDefinition newUser =
                new RootBeanDefinition(User.class);

        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("id", "1"));
        propertyValues.addPropertyValue(new PropertyValue("name", "jack"));
        newUser.setPropertyValues(propertyValues);
        registry.registerBeanDefinition("user",newUser);
        return (BeanFactory) registry;
    }


}
