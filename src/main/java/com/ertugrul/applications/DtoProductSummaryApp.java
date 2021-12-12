package com.ertugrul.applications;

import com.ertugrul.dto.ProductSummaryDto;
import com.ertugrul.entityservice.ProductEntityService;

import java.util.List;


//3. Ürünlere yapılmış olan yorum sayılarını gösteren bir metot
public class DtoProductSummaryApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<ProductSummaryDto> productSummaryDtoList = service.findAllProductSummaryDto();

        for (ProductSummaryDto productSummaryDto : productSummaryDtoList) {
            System.out.println(productSummaryDto);
        }
    }

}
