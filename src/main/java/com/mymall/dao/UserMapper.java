package com.mymall.dao;

import com.mymall.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);//将全部字段插入，会插入null

    int insertSelective(User record);  //只插入数据不为null的字段，不会插入null

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}