package com.ertugrul.applications;

import com.ertugrul.entity.Product;
import com.ertugrul.entityservice.ProductEntityService;

import java.math.BigDecimal;
import java.util.List;

public class FindBetweenApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<Product> productList = service.findAllProductListByPriceBetween(BigDecimal.valueOf(100), BigDecimal.valueOf(1000));

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}