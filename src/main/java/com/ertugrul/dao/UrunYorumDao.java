package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.dto.UrunYorumDto;
import com.ertugrul.dto.UrunOzetDto;
import com.ertugrul.entity.UrunYorum;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class UrunYorumDao extends BaseDao {

    public List<UrunYorum> findAll() {

        String sql = "select urunYorum from UrunYorum urunYorum";

        Query query = getCurrentSession().createQuery(sql);

        return (List<UrunYorum>) query.list();
    }

    public UrunYorum findById(Long id) {

        String sql = "select urunYorum from UrunYorum urunYorum where urunYorum.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (UrunYorum) query.uniqueResult();
    }

    public List<UrunYorumDto> findUrunYorumDtoByUrunId(Long urunId) {
        String sql = " select " +
                " new com.ertugrul.dto.UrunYorumDto( urun.adi, kategori.adi, urun.fiyat, kullanici.adi, kullanici.soyadi, kullanici.email, kullanici.telefon, urunYorum.yorum, urunYorum.yorumTarihi ) " +
                " from UrunYorum urunYorum " +
                " left join Kategori kategori on urunYorum.urun.kategori.id = kategori.id " +
                " left join Kullanici kullanici on urunYorum.kullanici.id = kullanici.id " +
                " left join Urun urun on urunYorum.urun.id = urun.id " +
                " where urunYorum.urun.id = :urunId ";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("urunId", urunId);

        return (List<UrunYorumDto>) query.list();
    }
}