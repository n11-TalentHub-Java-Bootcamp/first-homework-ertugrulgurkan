package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.entity.Category;
import org.hibernate.query.Query;

import java.util.List;

public class CategoryDao extends BaseDao {

    public List<Category> findAll() {

        Query query = getCurrentSession().createQuery(
                "select category from Category category");

        return query.list();
    }
}