package org.yunzhong.NewsCollector.service.dao;

import org.yunzhong.NewsCollector.entity.ArticleItemImage;

public interface ArticleItemImageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleItemImage record);

    int insertSelective(ArticleItemImage record);

    ArticleItemImage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleItemImage record);

    int updateByPrimaryKeyWithBLOBs(ArticleItemImage record);

    int updateByPrimaryKey(ArticleItemImage record);
}