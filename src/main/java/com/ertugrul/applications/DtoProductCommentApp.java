package com.ertugrul.applications;

import com.ertugrul.dto.ProductCommentDto;
import com.ertugrul.entityservice.ProductCommentEntityService;

import java.util.List;

//2. Bir ürüne ait yorumları listeleyen bir metot
public class DtoProductCommentApp {

    public static void main(String[] args) {

        ProductCommentEntityService service = new ProductCommentEntityService();
        List<ProductCommentDto> productCommentDtoList = service.findProductCommentDtoByProductId(3L);

        for (ProductCommentDto productCommentDto : productCommentDtoList) {
            System.out.println(productCommentDto);
        }
    }
}
