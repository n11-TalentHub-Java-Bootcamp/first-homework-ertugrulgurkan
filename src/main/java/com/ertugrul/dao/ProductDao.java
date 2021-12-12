package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.dto.ProductDetailDto;
import com.ertugrul.dto.ProductSummaryDto;
import com.ertugrul.entity.Product;
import org.hibernate.query.Query;

import java.math.BigDecimal;
import java.util.List;

public class ProductDao extends BaseDao {

    public List<Product> findAll() {

        String sql = "select product from Product product";

        Query query = getCurrentSession().createQuery(sql);

        return query.list();
    }

    public Product findById(Long id) {

        String sql = "select product from Product product where product.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (Product) query.uniqueResult();
    }

    public List<Product> findAllProductListByPriceGeAndPriceLe(BigDecimal priceGe, BigDecimal priceLe) {

        String sql = "select product from Product product where 1=1 ";

        if (priceGe != null) {
            sql = sql + " and product.price >= :priceGe ";
        }

        if (priceLe != null) {
            sql = sql + " and product.price <= :priceLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("priceLe", priceLe);
        query.setParameter("priceGe", priceGe);

        return query.list();
    }

    public List<Product> findAllProductListByPriceBetween(BigDecimal priceGe, BigDecimal priceLe) {

        String sql = "select product from Product product where 1=1 ";

        if (priceGe != null && priceLe != null) {
            sql = sql + " and product.price between :priceGe and :priceLe ";
        }

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("priceLe", priceLe);
        query.setParameter("priceGe", priceGe);

        return query.list();
    }

    public List<Product> findAllProductByCategoryDepth(Long depth) {

        String sql = " select product from Product product " +
                " left join Category category  on product.category.id = category.id " +
                " where category.depth = :depth ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("depth", depth);

        return query.list();
    }

    public List<ProductDetailDto> findAllProductDetailDtoByCategoryDepth(Long depth) {

        String sql = " select " +
                " new com.ertugrul.dto.ProductDetailDto( product.name, category.name, product.price ) " +
                " from Product product " +
                " left join Category category  on product.category.id = category.id " +
                " where category.depth = :depth ";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("depth", depth);

        return query.list();
    }

    public List<ProductSummaryDto> ProductSummaryDto() {

        String sql = " select " +
                " new com.ertugrul.dto.ProductSummaryDto( product.id , product.name, product.price, count(productComment.id) ) " +
                " from ProductComment productComment, Product product " +
                " where 1=1" +
                " and product.id = productComment.product.id" +
                " group by product.name, product.price, product.id";
        Query query = getCurrentSession().createQuery(sql);

        return (List<ProductSummaryDto>) query.list();
    }
}