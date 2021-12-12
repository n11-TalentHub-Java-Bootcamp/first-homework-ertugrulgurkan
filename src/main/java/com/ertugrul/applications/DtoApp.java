package com.ertugrul.applications;

import com.ertugrul.dto.ProductDetailDto;
import com.ertugrul.entityservice.ProductEntityService;

import java.util.List;

public class DtoApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<ProductDetailDto> productDetailDtos = service.findAllProductDetailDtoByCategoryDepth(3L);

        for (ProductDetailDto productDetailDto : productDetailDtos) {
            System.out.println(productDetailDto);
        }
    }
}