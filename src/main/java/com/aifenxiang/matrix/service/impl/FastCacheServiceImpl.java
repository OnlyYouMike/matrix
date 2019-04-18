package com.aifenxiang.matrix.service.impl;

import com.aifenxiang.matrix.service.FastCacheService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author: zj
 * @create: 2018-08-27 14:52
 **/
public class FastCacheServiceImpl implements FastCacheService {


    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public Object getByKey(String keyName, Class clazz) {

        if (StringUtils.isBlank(keyName) || null == clazz){

        }


        return null;
    }
}
