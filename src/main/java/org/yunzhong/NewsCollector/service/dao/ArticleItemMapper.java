package org.yunzhong.NewsCollector.service.dao;

import org.yunzhong.NewsCollector.entity.ArticleItem;

public interface ArticleItemMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleItem record);

    int insertSelective(ArticleItem record);

    ArticleItem selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleItem record);

    int updateByPrimaryKeyWithBLOBs(ArticleItem record);

    int updateByPrimaryKey(ArticleItem record);
}