package com.ertugrul.applications;

import com.ertugrul.dto.UrunYorumDto;
import com.ertugrul.entityservice.UrunYorumEntityService;

import java.util.List;

public class DtoUrunYorumApp {

    public static void main(String[] args) {

        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorumDto> urunYorumList = service.findUrunYorumDtoByUrunId(3L);

        for (UrunYorumDto urunDetayDto : urunYorumList) {
            System.out.println(urunDetayDto);
        }

    }
}
