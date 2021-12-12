package com.ertugrul.entityservice;

import com.ertugrul.dao.ProductDao;
import com.ertugrul.dto.ProductDetailDto;
import com.ertugrul.dto.ProductSummaryDto;
import com.ertugrul.entity.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductEntityService {

    private final ProductDao productDao;

    public ProductEntityService() {
        productDao = new ProductDao();
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findById(Long id) {
        return productDao.findById(id);
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe) {
        return productDao.findAllProductListByPriceGeAndPriceLe(priceGe, priceLe);
    }

    public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe) {
        return productDao.findAllProductListByPriceBetween(priceGe, priceLe);
    }

    public List<Product> findAllProductByCategoryDepth(Long depth) {
        return productDao.findAllProductByCategoryDepth(depth);
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryDepth(Long depth) {
        return productDao.findAllProductDetailDtoByCategoryDepth(depth);
    }


    public List<ProductSummaryDto> findAllProductSummaryDto() {
        return productDao.ProductSummaryDto();
    }

}