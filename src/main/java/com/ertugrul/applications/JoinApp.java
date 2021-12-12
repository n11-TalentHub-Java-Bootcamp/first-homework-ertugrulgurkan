package com.ertugrul.applications;

import com.ertugrul.entity.Product;
import com.ertugrul.entityservice.ProductEntityService;

import java.util.List;

public class JoinApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<Product> productList = service.findAllProductByCategoryDepth(3L);

        for (Product product : productList) {
            System.out.println(product);
        }
    }
}