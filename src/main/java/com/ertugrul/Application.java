package com.ertugrul;
import com.ertugrul.entity.Kategori;
import com.ertugrul.entityservice.KategoriEntityService;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        KategoriEntityService service = new KategoriEntityService();
        List<Kategori> kategoriList = service.findAll();

        for (Kategori kategori : kategoriList) {
            System.out.println(kategori.getAdi());
        }



    }
}
