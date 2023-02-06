package com.hook;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description 增强所有的mapper接口方法
 * Author hebaokai
 * Date 2023/2/3 17:10
 *
 *
 * 代理类的生成需要交给工厂。
 *
 * @Version 1.0
 **/



public class MapperProxy  implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy do something");
        return null;
    }
}
