package com.aifenxiang.matrix.service;

/**
 * @author: zj
 * @create: 2018-08-27 14:52
 **/
public interface FastCacheService<T> {


    T getByKey(String keyName,Class<T> clazz);

}
