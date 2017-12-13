package org.yunzhong.NewsCollector.service;

import java.util.List;

import org.yunzhong.NewsCollector.entity.Categories;

public interface CategoryService {

    List<Categories> listByOwner(String owner);

}
