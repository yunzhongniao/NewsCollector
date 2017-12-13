package org.yunzhong.NewsCollector.service.dao;

import org.yunzhong.NewsCollector.entity.WebSource;

public interface WebSourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WebSource record);

    int insertSelective(WebSource record);

    WebSource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WebSource record);

    int updateByPrimaryKeyWithBLOBs(WebSource record);

    int updateByPrimaryKey(WebSource record);
}