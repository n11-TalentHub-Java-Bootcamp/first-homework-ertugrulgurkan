package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.entity.Kategori;
import org.hibernate.query.Query;

import java.util.List;

public class KategoriDao extends BaseDao {

    public List<Kategori> findAll() {

        Query query = getCurrentSession().createQuery(
                "select kategori from Kategori kategori");

        return query.list();
    }
}