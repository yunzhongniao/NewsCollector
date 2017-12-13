package org.yunzhong.NewsCollector.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yunzhong.NewsCollector.entity.Categories;
import org.yunzhong.NewsCollector.service.CategoryService;
import org.yunzhong.NewsCollector.service.dao.CategoriesMapper;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoriesMapper categoryMapper;
    
    @Override
    public List<Categories> listByOwner(String owner) {
        return categoryMapper.listByOwner(owner);
    }

}
