package com.hook.springmybatis.mapper;


import com.hook.springmybatis.pojo.Stock;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StockMapper {

    @Select("select id , product_code as pCode, ware_house as wHouse, stock from stock")
    List<Stock> findAll();

}
