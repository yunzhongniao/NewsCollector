package org.yunzhong.NewsCollector.service.dao;

import org.yunzhong.NewsCollector.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);
    
    int updateByPrimaryKey(User record);
}