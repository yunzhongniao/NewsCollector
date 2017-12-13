package org.yunzhong.NewsCollector.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.yunzhong.NewsCollector.entity.Categories;

public interface CategoriesMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Categories record);

    int insertSelective(Categories record);

    Categories selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Categories record);

    int updateByPrimaryKey(Categories record);

    List<Categories> listByOwner(@Param("owner") String owner);
}