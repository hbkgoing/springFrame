package com.hook.springmybatis.pojo;

/**
 * Description TODO
 * Author hebaokai
 * Date 2022/12/7 09:58
 *
 * @Version 1.0
 **/
public class User {


    private Long id;

    private String userName;

    private String password;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
