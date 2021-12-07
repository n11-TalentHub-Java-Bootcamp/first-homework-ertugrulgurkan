package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.entity.Kategori;
import com.ertugrul.entity.Kullanici;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao extends BaseDao {

    public List<Kullanici> findAll() {

        Query query = getCurrentSession().createQuery(
                "select kullanici from Kullanici kullanici");

        return query.list();
    }
}