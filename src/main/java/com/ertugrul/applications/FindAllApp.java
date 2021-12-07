package com.ertugrul.applications;

import com.ertugrul.entity.Kullanici;
import com.ertugrul.entity.Urun;
import com.ertugrul.entity.UrunYorum;
import com.ertugrul.entityservice.KullaniciEntityService;
import com.ertugrul.entityservice.UrunEntityService;
import com.ertugrul.entityservice.UrunYorumEntityService;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        UrunEntityService service = new UrunEntityService();
        List<Urun> urunList = service.findAll();

        for (Urun urun : urunList) {
            System.out.println(urun);
        }

        KullaniciEntityService kullaniciEntityService = new KullaniciEntityService();
        List<Kullanici> kullaniciList = kullaniciEntityService.findAll();

        for (Kullanici kullanici : kullaniciList) {
            System.out.println(kullanici);
        }

        UrunYorumEntityService urunYorumEntityService = new UrunYorumEntityService();
        List<UrunYorum> urunYorumList = urunYorumEntityService.findAll();

        for (UrunYorum urunYorum : urunYorumList) {
            System.out.println(urunYorum);
        }
    }
}