package com.ertugrul.dao;

import com.ertugrul.base.BaseDao;
import com.ertugrul.dto.ProductCommentDto;
import com.ertugrul.entity.ProductComment;
import org.hibernate.query.Query;

import java.util.List;

public class ProductCommentDao extends BaseDao {

    public List<ProductComment> findAll() {

        String sql = "select productComment from ProductComment productComment";

        Query query = getCurrentSession().createQuery(sql);

        return (List<ProductComment>) query.list();
    }

    public ProductComment findById(Long id) {

        String sql = "select productComment from ProductComment productComment where productComment.id = :givenId";

        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("givenId", id);

        return (ProductComment) query.uniqueResult();
    }

    public List<ProductCommentDto> findProductCommentDtoByProductId(Long productId) {
        String sql = " select " +
                " new com.ertugrul.dto.ProductCommentDto( product.name, category.name, product.price, user.name, user.surname, user.email, user.phone, productComment.comment, productComment.commentDate ) " +
                " from ProductComment productComment " +
                " left join Category category on productComment.product.category.id = category.id " +
                " left join User user on productComment.user.id = user.id " +
                " left join Product product on productComment.product.id = product.id " +
                " where productComment.product.id = :productId ";
        Query query = getCurrentSession().createQuery(sql);
        query.setParameter("productId", productId);

        return (List<ProductCommentDto>) query.list();
    }
}