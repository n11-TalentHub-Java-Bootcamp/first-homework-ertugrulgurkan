package com.ertugrul.applications;

import com.ertugrul.entity.Category;
import com.ertugrul.entityservice.CategoryEntityService;

import java.util.List;

public class FindAllCategoryApp {

    public static void main(String[] args) {
        CategoryEntityService service = new CategoryEntityService();
        List<Category> categoryList = service.findAll();

        for (Category category : categoryList) {
            System.out.println(category.getName());
        }
    }
}
