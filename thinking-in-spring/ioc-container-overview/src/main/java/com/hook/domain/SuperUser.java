package com.hook.domain;

import com.hook.annotation.Super;

/**
 * Description TODO
 * Author hebaokai
 * Date 2022/12/6 14:39
 *
 * @Version 1.0
 **/

@Super
public class SuperUser extends User{


    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                '}' +super.toString();
    }
}
