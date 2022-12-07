package com.hook.domain;

/**
 * Description 用户类
 * Author hebaokai
 * Date 2022/12/6 10:58
 *
 * @Version 1.0
 **/
public class User {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
