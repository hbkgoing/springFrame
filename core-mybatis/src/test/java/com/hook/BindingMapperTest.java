package com.hook;

import com.hook.mapper.UserMapper;
import org.junit.Test;

/**
 * Description TODO
 * Author hebaokai
 * Date 2023/2/6 13:58
 *
 * @Version 1.0
 **/
public class BindingMapperTest {


    @Test
    public void bindingTest() {
        MapperProxyFactory<UserMapper> factory = new MapperProxyFactory<>(UserMapper.class);
        UserMapper userMapper = factory.newInstance(new MapperProxy());
        userMapper.getUser();
    }


}
