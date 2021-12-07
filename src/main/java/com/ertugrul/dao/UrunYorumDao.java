package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.dto.UrunDetayDto;
import com.ertugrul.entity.Urun;
import com.ertugrul.entity.UrunYorum;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class UrunYorumDao extends BaseDao {

    public List<UrunYorum> findAll() {

        String sql = "select urunYorum from UrunYorum urunYorum";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public UrunYorum findById(Long id) {

        String sql = "select urunYorum from UrunYorum urunYorum where urunYorum.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (UrunYorum) query.uniqueResult();
    }

}