package com.ertugrul.entityservice;

import com.ertugrul.dao.CategoryDao;
import com.ertugrul.entity.Category;

import java.util.List;

public class CategoryEntityService {

    private final CategoryDao categoryDao;

    public CategoryEntityService() {
        categoryDao = new CategoryDao();
    }

    public List<Category> findAll() {
        return categoryDao.findAll();
    }
}