package com.ertugrul.applications;

import com.ertugrul.entity.Product;
import com.ertugrul.entityservice.ProductEntityService;

public class FindByIdApp {

    public static void main(String[] args) {
        ProductEntityService service = new ProductEntityService();
        Product product = service.findById(1L);

        System.out.println(product);
    }
}