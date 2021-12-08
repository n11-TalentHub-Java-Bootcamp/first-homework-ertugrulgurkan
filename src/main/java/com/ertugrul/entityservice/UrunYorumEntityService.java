package com.ertugrul.entityservice;

import com.ertugrul.dao.UrunYorumDao;
import com.ertugrul.dto.UrunYorumDto;
import com.ertugrul.entity.UrunYorum;

import java.util.List;

public class UrunYorumEntityService {

    private final UrunYorumDao urunYorumDao;

    public UrunYorumEntityService() {
        urunYorumDao = new UrunYorumDao();
    }

    public List<UrunYorum> findAll(){
        return urunYorumDao.findAll();
    }

    public UrunYorum findById(Long id){
        return urunYorumDao.findById(id);
    }

    public List<UrunYorumDto> findUrunYorumDtoByUrunId(Long urunId) {
        return urunYorumDao.findUrunYorumDtoByUrunId(urunId);
    }

}