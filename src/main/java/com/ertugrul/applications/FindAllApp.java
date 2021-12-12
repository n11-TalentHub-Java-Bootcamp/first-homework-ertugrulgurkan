package com.ertugrul.applications;

import com.ertugrul.entity.Product;
import com.ertugrul.entity.ProductComment;
import com.ertugrul.entity.User;
import com.ertugrul.entityservice.ProductCommentEntityService;
import com.ertugrul.entityservice.ProductEntityService;
import com.ertugrul.entityservice.UserEntityService;

import java.util.List;

public class FindAllApp {

    public static void main(String[] args) {

        ProductEntityService service = new ProductEntityService();
        List<Product> productList = service.findAll();

        for (Product product : productList) {
            System.out.println(product);
        }

        UserEntityService userEntityService = new UserEntityService();
        List<User> userList = userEntityService.findAll();

        for (User user : userList) {
            System.out.println(user);
        }

        ProductCommentEntityService productCommentEntityService = new ProductCommentEntityService();
        List<ProductComment> productCommentList = productCommentEntityService.findAll();

        for (ProductComment productComment : productCommentList) {
            System.out.println(productComment);
        }
    }
}