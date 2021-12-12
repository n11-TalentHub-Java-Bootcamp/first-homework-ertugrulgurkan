package com.ertugrul.entityservice;

import com.ertugrul.dao.ProductCommentDao;
import com.ertugrul.dto.ProductCommentDto;
import com.ertugrul.entity.ProductComment;

import java.util.List;

public class ProductCommentEntityService {

    private final ProductCommentDao productCommentDao;

    public ProductCommentEntityService() {
        productCommentDao = new ProductCommentDao();
    }

    public List<ProductComment> findAll() {
        return productCommentDao.findAll();
    }

    public ProductComment findById(Long id) {
        return productCommentDao.findById(id);
    }

    public List<ProductCommentDto> findProductCommentDtoByProductId(Long productId) {
        return productCommentDao.findProductCommentDtoByProductId(productId);
    }

}