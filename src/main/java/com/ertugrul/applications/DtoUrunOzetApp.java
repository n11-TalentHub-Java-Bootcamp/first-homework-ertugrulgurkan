package com.ertugrul.applications;

import com.ertugrul.dto.UrunOzetDto;
import com.ertugrul.entityservice.UrunEntityService;

import java.util.List;

public class DtoUrunOzetApp {


    public static void main(String[] args) {

        UrunEntityService service = new UrunEntityService();
        List<UrunOzetDto> urunOzetList = service.findAllUrunOzetDto();

        for (UrunOzetDto urunOzetDto : urunOzetList) {
            System.out.println(urunOzetDto);
        }
    }

}
