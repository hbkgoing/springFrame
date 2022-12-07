package com.hook.springmybatis.pojo;

/**
 * Description TODO
 * Author hebaokai
 * Date 2022/12/7 09:47
 *
 * @Version 1.0
 **/

public class Stock {

    private Long id;

    private String pCode;

    private String wHouse;

    private String stock;

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", pCode='" + pCode + '\'' +
                ", wHouse='" + wHouse + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getwHouse() {
        return wHouse;
    }

    public void setwHouse(String wHouse) {
        this.wHouse = wHouse;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
