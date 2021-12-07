package com.ertugrul.entityservice;


import com.ertugrul.dao.KategoriDao;
import com.ertugrul.dao.KullaniciDao;
import com.ertugrul.entity.Kategori;
import com.ertugrul.entity.Kullanici;

import java.util.List;

public class KullaniciEntityService {

    private final KullaniciDao kullaniciDao;

    public KullaniciEntityService() {
        kullaniciDao = new KullaniciDao();
    }

    public List<Kullanici> findAll(){
        return kullaniciDao.findAll();
    }
}