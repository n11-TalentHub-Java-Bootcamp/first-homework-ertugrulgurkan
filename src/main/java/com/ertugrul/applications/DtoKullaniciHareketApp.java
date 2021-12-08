package com.ertugrul.applications;

import com.ertugrul.dto.KullaniciHareketDto;
import com.ertugrul.entityservice.KullaniciEntityService;

import java.util.List;

public class DtoKullaniciHareketApp {
    public static void main(String[] args) {

        KullaniciEntityService service = new KullaniciEntityService();
        List<KullaniciHareketDto> kullaniciHareketList = service.findUserCommentsByUserId(1L);

        for (KullaniciHareketDto kullaniciHareket : kullaniciHareketList) {
            System.out.println(kullaniciHareket);
        }
    }
}
