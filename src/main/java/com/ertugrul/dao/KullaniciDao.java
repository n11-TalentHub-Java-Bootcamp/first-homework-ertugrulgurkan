package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.dto.KullaniciHareketDto;
import com.ertugrul.entity.Kullanici;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao extends BaseDao {

    public List<Kullanici> findAll() {

        Query query = getCurrentSession().createQuery(
                "select kullanici from Kullanici kullanici");

        return (List<Kullanici>) query.list();
    }

    public List<KullaniciHareketDto> findUserCommentsByUserId(Long id) {
        String sql = " select " +
                " new com.ertugrul.dto.KullaniciHareketDto( kullanici.id, kullanici.adi, urun.adi, urunYorum.yorum, urunYorum.yorumTarihi ) " +
                " from Kullanici kullanici, UrunYorum urunYorum, Urun urun " +
                " where 1=1" +
                " and urun.id = urunYorum.urun.id" +
                " and kullanici.id = urunYorum.kullanici.id" +
                " and kullanici.id = :id";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("id", id);

        return (List<KullaniciHareketDto>) query.list();
    }
}