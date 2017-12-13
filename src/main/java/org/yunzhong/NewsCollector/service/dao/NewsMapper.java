package org.yunzhong.NewsCollector.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.yunzhong.NewsCollector.entity.News;

public interface NewsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);

    List<News> listNews(@Param("owner") String owner, @Param("category") String category);
}