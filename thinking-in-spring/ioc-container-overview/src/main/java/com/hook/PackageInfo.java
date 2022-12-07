package com.hook;

/**
 * Description TODO
 * Author hebaokai
 * Date 2022/12/6 14:59
 *
 *
 * 这里讨论的问题：
 *
 * 1. dependency lookup vs dependency injection 他们之间的区别：
 *
 *   主动跟容器要bean--->DL
 *   根据一些约定，容器自动将bean注入到bean中  ----->DI
 *
 *
 * 2.从使用Spring的角度来讲
 *   定义bean信息交给容器，容器会初始化这些bean，这些bean配置信息中又依赖了其他的bean，
 *   容器在初始化这中嵌套bean的时候，肯定要lookup，然后自动完成injection。
 *
 *
 * 3.什么是延迟加载
 *
 *
 *
 * @Version 1.0
 **/

