package com.hook;

import java.lang.reflect.Proxy;

/**
 * Description 用来生成代理类
 * Author hebaokai
 * Date 2023/2/3 17:14
 *
 * @Version 1.0
 **/
public class MapperProxyFactory<T> {


    private final Class<T> interfaceClass;

    MapperProxyFactory( Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    //invocationHandler是通过参数传递，还是直接作为factory的属性？
    public T newInstance(MapperProxy mapperProxy) {
        return (T)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                                new Class[]{interfaceClass},
                                mapperProxy
                );

    }

}
